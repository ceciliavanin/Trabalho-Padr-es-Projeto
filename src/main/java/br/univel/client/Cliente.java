package br.univel.client;

import br.univel.Pessoa;
import br.univel.connectionBD.annotations.Column;

public class Cliente {

	@Column (nome = "CPF", tamanho=11)
    private String cpf;
	
	@Column (nome = "USER", tamanho=8)
    private String agencia;
    
	@Column (nome = "TIPOCONTA", tamanho=2)
	private TipoConta tipoConta;
	
    private Pessoa p;
    
    public Cliente() {
	}
	public Cliente(String cpf, String agencia, String nome, String usuario, String senhaAcesso, String senhaOperacoes,
			TipoConta tipoConta, int idade) {
		super();
		p.setNome(nome);
		this.cpf = cpf;
		this.agencia = agencia;
		p.setIdade(idade);
		p.setUsuario(usuario);
		p.setSenhaConta(senhaAcesso);
		p.setSenhaOperacao(senhaOperacoes);
		this.tipoConta = tipoConta;
	}

        
}
