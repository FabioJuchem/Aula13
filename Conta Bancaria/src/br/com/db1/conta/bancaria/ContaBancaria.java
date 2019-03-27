package br.com.db1.conta.bancaria;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {

	private String numero;

	private String agencia;

	private Double saldo;

	private ContaBancariaTipo tipo = ContaBancariaTipo.CORRENTE;

	private List<ContaBancariaHistorico> historicos = new ArrayList<>();

	private Cliente cliente;

	public ContaBancaria(String numero, String agencia, Double saldo, ContaBancariaTipo tipo, Cliente cliente) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.tipo = tipo;
		this.cliente = cliente;
	}

	public void sacar(Double valor) {
		if (valor > saldo) {
			throw new RuntimeException("Você não possui saldo o suficiente: " + saldo);
		}
		this.saldo = this.saldo - valor;
		ContaBancariaHistorico historico = new ContaBancariaHistorico(ContaBancariaTipoOperacao.SAIDA, valor);
		this.historicos.add(historico);

	}

	public void depositar(Double valor) {
		if (valor <= 0) {
			throw new RuntimeException("Valor negativo ou invalido");
		}
		this.saldo = this.saldo + valor;
		ContaBancariaHistorico historico = new ContaBancariaHistorico(ContaBancariaTipoOperacao.SAIDA, valor);
		this.historicos.add(historico);
	

	}
	private void novoHistorico(ContaBancariaTipoOperacao tipo, Double valor){
		ContaBancariaHistorico historico = new ContaBancariaHistorico(tipo, valor);
		this.historicos.add(historico);
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public List<ContaBancariaHistorico> getHistorico() {
		return this.historicos;
	}

}
