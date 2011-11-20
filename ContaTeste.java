package br.com.xti.poo;

public class ContaTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conta conta = new Conta();	
		conta.cliente = "Thaise";
		conta.saldo = 10000;
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Jonas";
		destino.saldo = 2000;
		destino.exibeSaldo();
		
		conta.transfere(destino, 1150);
		conta.exibeSaldo();
		destino.exibeSaldo();
		
	}

}
