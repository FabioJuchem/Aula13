package br.com.db1.conta.bancaria;

public class Cliente {
	
	private String nome;
	
	private String cpf;
	
	
	//construtor
	public Cliente(String nome,String cpf){
	if(nome == null){
		throw new RuntimeException("Nome é obrigatorio");
	}
	
	if(nome.length() < 5){
		throw new RuntimeException("Nome deve ser maior ou igual a 5");
	}
	if(cpf == null){
		throw new RuntimeException("CPF é obrgatorio");
	}
	if(cpf.length() < 9){
		throw new RuntimeException("CPF de tamanho incorreto");
	}
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	//metodos
	public String getNome(){
		return this.nome;
	}
	public String getCPF(){
		return this.cpf;
	}

}
