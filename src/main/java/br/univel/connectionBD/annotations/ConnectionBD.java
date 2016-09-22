package br.univel.connectionBD.annotations;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public interface ConnectionBD {

	public Connection abrirConexao() throws IOException;
	
	public PreparedStatement getSqlInsert(Connection con, Object obj);
	
	public PreparedStatement getSqlSelectById(Connection con, Object obj, int id);
	
}
