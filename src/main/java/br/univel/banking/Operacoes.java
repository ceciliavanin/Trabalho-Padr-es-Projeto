package br.univel.banking;

import br.univel.client.TipoConta;

public interface Operacoes {

	public void novaConta(String nome, int idade, String cpf, String agencia, TipoConta tipo, String username,String senhaAcesso, String senhaOeracoes );
	public void cadProfissional(String nome, int idade, String username, String senhaAcesso, String senhaOperacoes);
	public void cadAgencia(String nome, String numero, String cidade );
	
}
