package br.univel.client;

import java.math.BigDecimal;

public class ImplOperacoes implements Operacoes {
	private BigDecimal saldo;
	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public Boolean saques(BigDecimal valor) {
		BigDecimal saldo = getSaldo();
		if (valor.compareTo(saldo)==1){			
			return false;
		} else {
			saldo.subtract(valor);
			setSaldo(saldo);
			return true;
		}
		
	}

	

	public Boolean depositoContaLogada(BigDecimal valor) {
		BigDecimal saldo = getSaldo();
		saldo.add(valor);
		setSaldo(saldo);
		return true;
	}

	public Boolean transferencia(BigDecimal valor, String agDestinatario, String contaDestinatario, TipoConta tipoConta,
			String nome) {
		BigDecimal saldo = getSaldo();
		if (valor.compareTo(getSaldo())==1){
			return false;
		} else {
			saldo.subtract(valor);
			setSaldo(saldo);
			return true;
		}
	}

	public Boolean pagamento(String codigoBarra, BigDecimal valor) {
		BigDecimal saldo = getSaldo();
		if (valor.compareTo(saldo)==1){
			return false;
		} else {
			saldo.subtract(valor);
			setSaldo(saldo);
			return true;
		}
	}

	public void finalizar() {
		
	}

}
