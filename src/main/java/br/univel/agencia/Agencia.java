package br.univel.agencia;

import br.univel.connectionBD.annotations.Column;

public class Agencia {
	@Column (nome = "NOME", tamanho=15)
	private String nome;
	
	@Column (nome = "NUMERO", tamanho=8)
	private String numero;
	
	@Column (nome = "CIDADE", tamanho=20)
	private String cidade;
	
	public Agencia() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
}
