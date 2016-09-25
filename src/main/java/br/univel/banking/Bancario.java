package br.univel.banking;

import br.univel.Pessoa;
import br.univel.client.TipoConta;

public class Bancario extends Pessoa{

	private Pessoa p;
	
	public Bancario( String nome, String usuario, String senhaAcesso, String senhaOperacoes, int idade) {
		super();
		p.setNome(nome);
		p.setIdade(idade);
		p.setUsuario(usuario);
		p.setSenhaConta(senhaAcesso);
		p.setSenhaOperacao(senhaOperacoes);
	}	
}
