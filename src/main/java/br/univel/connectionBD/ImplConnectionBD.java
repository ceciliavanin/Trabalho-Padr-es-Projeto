package br.univel.connectionBD;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.univel.connectionBD.annotations.Column;
import br.univel.connectionBD.annotations.ConnectionBD;
import br.univel.connectionBD.annotations.Table;

public class ImplConnectionBD implements ConnectionBD {

		private static Connection con;

		public Connection abrirConexao() throws IOException {
			String url;
			String user;
			String password;

			url = "jdbc:mysql:~/database";
			user = "";
			password = "";

			try {
				Class.forName("org.mysql.Driver");
				con = DriverManager.getConnection(url, user, password);
				return con;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return null;
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
		
		public PreparedStatement getSqlInsert(Connection con, Object obj) {

			Class<? extends Object> cl = obj.getClass();

			StringBuilder sb = new StringBuilder();

			{
				String nomeTabela;
				if (cl.isAnnotationPresent(Table.class)) {

					Table anotacaoTabela = cl.getAnnotation(Table.class);
					nomeTabela = anotacaoTabela.value();

				} else {
					nomeTabela = cl.getSimpleName().toUpperCase();

				}
				sb.append("INSERT INTO ").append(nomeTabela).append(" (");
			}

			Field[] atributos = cl.getDeclaredFields();

			{
				for (int i = 0; i < atributos.length; i++) {

					Field field = atributos[i];

					String nomeColuna;

					if (field.isAnnotationPresent(Column.class)) {
						Column anotacaoColuna = field.getAnnotation(Column.class);

						if (anotacaoColuna.nome().isEmpty()) {
							nomeColuna = field.getName();
						} else {
							nomeColuna = anotacaoColuna.nome();
						}

					} else {
						nomeColuna = field.getName();
					}

					if (i > 0) {
						sb.append(", ");
					}

					sb.append(nomeColuna);
				}
			}

			sb.append(") VALUES (");

			for (int i = 0; i < atributos.length; i++) {
				if (i > 0) {
					sb.append(", ");
				}
				sb.append('?');
			}
			sb.append(')');

			String strSql = sb.toString();

			try {
				PreparedStatement ps = con.prepareStatement(strSql);

				for (int i = 0; i < atributos.length; i++) {

					Field field = atributos[i];

					field.setAccessible(true);

					if (field.getType().equals(int.class)) {
						ps.setInt(i + 1, field.getInt(obj));

					} else if (field.getType().equals(String.class)) {
						ps.setString(i + 1, String.valueOf(field.get(obj)));

					} else if (field.getType().isEnum()) {
						Object valor = field.get(obj);
						Method m = valor.getClass().getMethod("ordinal");
						ps.setInt(i + 1, (Integer) m.invoke(valor, null));

					} else {
						throw new RuntimeException("Tipo n�o suportado, falta implementar.");

					}
				}
				return ps;

			} catch (SQLException e) {
				e.printStackTrace();
				return null;

			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				return null;

			} catch (IllegalAccessException e) {
				e.printStackTrace();
				return null;

			} catch (NoSuchMethodException e) {
				e.printStackTrace();
				return null;
			} catch (SecurityException e) {
				e.printStackTrace();
				return null;

			} catch (InvocationTargetException e) {
				e.printStackTrace();
				return null;

			}

		}
		
		public PreparedStatement getSqlSelectById(Connection con, Object obj, int id ){

				Class<? extends Object> cl = obj.getClass();

				StringBuilder sb = new StringBuilder();

				{
					String nomeTabela;
					if (cl.isAnnotationPresent(Table.class)) {

						Table anotacaoTabela = cl.getAnnotation(Table.class);
						nomeTabela = anotacaoTabela.value();

					} else {
						nomeTabela = cl.getSimpleName().toUpperCase();

					}
					
					sb.append("SELECT * FROM ").append(nomeTabela).append(" WHERE ");
				}
				Field[] atributos = cl.getDeclaredFields();

				for (int i = 0, achou = 0; i < atributos.length; i++) {

					Field field = atributos[i];

					if (field.isAnnotationPresent(Column.class)) {

						Column anotacaoColuna = field.getAnnotation(Column.class);

						if (anotacaoColuna.pk()) {

							if (achou > 0) {
								sb.append(", ");
							}

							if (anotacaoColuna.nome().isEmpty()) {
								sb.append(field.getName().toUpperCase());
							} else {
								sb.append(anotacaoColuna.nome());
							}

							achou++;
						}

					}
				}
				id = 1;
				sb.append(" = ").append(id);
				String strSql = sb.toString();

				PreparedStatement ps = null;
				try {
					ps = con.prepareStatement(strSql);

				} catch (SQLException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				}

				return ps;	
			}
}


