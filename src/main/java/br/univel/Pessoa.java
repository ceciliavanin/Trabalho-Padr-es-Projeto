package br.univel;

import br.univel.connectionBD.annotations.Column;

public class Pessoa {
	
	
	public Pessoa() {
	
	}
	
	@Column (nome = "ID", pk=true)
	protected int id;
	
	@Column (nome = "NAME", tamanho=100)
	protected String nome;
	
	@Column (nome = "IDADE", tamanho=25)
	protected int idade;
	
	@Column (nome = "USER", tamanho=10)
	protected String usuario;

	@Column (nome = "SENHACONTA", tamanho=6)
	protected String senhaConta;
	
	@Column (nome = "SENHACONTA", tamanho=6)
	protected String senhaOperacao;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenhaConta() {
		return senhaConta;
	}

	public void setSenhaConta(String senhaConta) {
		this.senhaConta = senhaConta;
	}

	public String getSenhaOperacao() {
		return senhaOperacao;
	}

	public void setSenhaOperacao(String senhaOperacao) {
		this.senhaOperacao = senhaOperacao;
	}

	
	
}
