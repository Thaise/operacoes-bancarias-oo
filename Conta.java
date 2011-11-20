package br.com.xti.poo;

public class Conta {
	
	String cliente;
	double saldo;
	
	void exibeSaldo(){
		System.out.println(cliente+", seu saldo é: "+saldo);
	}

	void saca(double valorSacado){
		saldo = saldo - valorSacado;
	}
	
	void deposita(double valorDeposito){
		saldo = saldo + valorDeposito;
	}
	
	void transfere(Conta destino, double valorTransferido){	
		this.saca(valorTransferido);
		destino.deposita(valorTransferido);
	}
}
