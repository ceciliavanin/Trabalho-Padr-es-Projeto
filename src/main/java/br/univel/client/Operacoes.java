package br.univel.client;

import java.math.BigDecimal;

public interface Operacoes {
	Boolean saques(BigDecimal valor);
	
	void deposito(String agencia, String conta, TipoConta tipo, String titular, BigDecimal valor);
	
	Boolean transferencia(BigDecimal valor, String agDestinatario, String contaDestinatario, TipoConta tipoConta, String nome);
	
	Boolean pagamento(String codigoBarra, BigDecimal valor);
	
	void finalizar();
}
