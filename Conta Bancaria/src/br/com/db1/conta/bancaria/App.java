package br.com.db1.conta.bancaria;

public class App {
	
	public static void main (String...args){
		
		Cliente cliente = new Cliente("Maiko Cunha", "999999999");
		
		ContaBancaria conta = new ContaBancaria(
				"1234",
				"004",
				1000.0,
				ContaBancariaTipo.CORRENTE,
				cliente);
		
		
	}

}
