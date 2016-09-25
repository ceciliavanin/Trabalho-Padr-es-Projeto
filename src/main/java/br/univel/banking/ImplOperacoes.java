package br.univel.banking;

import br.univel.agencia.Agencia;
import br.univel.client.Cliente;
import br.univel.client.TipoConta;

public class ImplOperacoes  implements Operacoes{

	public void novaConta(String nome, int idade, String cpf, String agencia, TipoConta tipo, String username,String senhaAcesso, String senhaOperacoes )
	{
		Cliente cl = new Cliente(cpf, agencia, nome, username, senhaAcesso, senhaOperacoes, tipo, idade);
		
	}

	public void cadProfissional(String nome, int idade, String username, String senhaAcesso, String senhaOperacoes) {
		Bancario bancario = new Bancario(nome, username, senhaAcesso, senhaOperacoes, idade);
		
	}

	public void cadAgencia(String nome, String numero, String cidade ) {
		Agencia ag = new Agencia();
		ag.setNome(nome);
		ag.setNumero(numero);
		ag.setCidade(cidade);
	}

}
