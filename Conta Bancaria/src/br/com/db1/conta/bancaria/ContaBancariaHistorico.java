package br.com.db1.conta.bancaria;

import java.time.LocalDateTime;

public class ContaBancariaHistorico {
	
	private LocalDateTime data;

	private ContaBancariaTipoOperacao tipoOperacao;
	
	private Double valor;
	
	//construtores

	public ContaBancariaHistorico(ContaBancariaTipoOperacao tipoOperacao, Double valor) {
		this.data = LocalDateTime.now();
		this.tipoOperacao = tipoOperacao;
		this.valor = valor;
	}
	
	
	
}
