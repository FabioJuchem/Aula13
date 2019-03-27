
package br.com.db1.conta.bancariaTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.conta.bancaria.Cliente;
import br.com.db1.conta.bancaria.ContaBancaria;
import br.com.db1.conta.bancaria.ContaBancariaTipo;

public class ContaBancariaTest {

	private ContaBancaria conta;

	@Before
	public void init() {
		Cliente cliente = new Cliente("Maiko Cunha", "99999999999");
		 conta = new ContaBancaria("1234", "0004", 1000.0, ContaBancariaTipo.CORRENTE, cliente);

	}

	@Test
	public void deveSacarDinheiroDaConta() {
		conta.sacar(500.0);
		Assert.assertEquals(500.0, conta.getSaldo(), 0);
		Assert.assertEquals(1, conta.getHistorico().size());
	}

	@Test(expected = RuntimeException.class)
	public void deveRetornarErroQuandoSaldoMenorQueSaque() {
		conta.sacar(2000.0);
	}

}
