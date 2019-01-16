package selecaoivia;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContadorLNTest {
	@Test
	public void DeveRetornarTresPara3( ) {
		ContadorLN ln = new ContadorLN();
		String result = ln.numeroPorExtenso(3);
		assertEquals("tres",result);
		
	}
	
	@Test
	public void DeveRetornarDezenovePara19( ) {
		ContadorLN ln = new ContadorLN();
		String result = ln.numeroPorExtenso(19);
		assertEquals("dezenove",result);
		
	}
	
		
	@Test
	public void DeveRetornarDuzentosENovePara209( ) {
		ContadorLN ln = new ContadorLN();
		String result = ln.numeroPorExtenso(209);
		assertEquals("duzentos e nove",result);
		
	}
	
	@Test
	public void DeveRetornar4ParaUm( ) {
		ContadorLN ln = new ContadorLN();
		int result = ln.tamanhoPalavra("tres");
		assertEquals(4,result);
		
	}
	
	@Test
	public void DeveRetornar8ParaDezenove( ) {
		ContadorLN ln = new ContadorLN();
		int result = ln.tamanhoPalavra("dezenove");
		assertEquals(8,result);
		
	}
	
	@Test
	public void DeveRetornar15ParaDuzentosENove( ) {
		ContadorLN ln = new ContadorLN();
		int result = ln.tamanhoPalavra("duzentos e nove");
		assertEquals(15,result);
		
	}
	
}	
	