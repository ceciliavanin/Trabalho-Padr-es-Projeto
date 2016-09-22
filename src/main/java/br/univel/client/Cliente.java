package br.univel.client;

import br.univel.Pessoa;

public class Cliente {

    private String cpf, agencia;
    private TipoConta tipoConta;
    private Pessoa p;
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
