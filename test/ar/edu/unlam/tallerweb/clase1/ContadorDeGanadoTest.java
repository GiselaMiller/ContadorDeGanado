package ar.edu.unlam.tallerweb.clase1;


import org.junit.Assert;
import org.junit.Test;

public class ContadorDeGanadoTest {

	@Test
	public void testQuePuedaContar() {
		ContadorDeGanado miContador = new ContadorDeGanado();
		Integer cantidadEsperada=1;
		miContador.contar();
		Integer cantidadObtenida=miContador.mostrarCantidad();
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
		miContador = null;		
	}
	
	@Test
	public void testAlInicializarDeberiaSerCero(){
		ContadorDeGanado miContador = new ContadorDeGanado();
		Integer cantidadEsperada=0;
		Integer cantidadObtenida=miContador.mostrarCantidad();
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
	}
	
	@Test
	public void testQuePuedaContarDeDosEnDos() {
		ContadorDeGanado miContador = new ContadorDeGanado();
		Integer cantidadEsperada=2;
		miContador.contar();
		Integer cantidadObtenida=miContador.mostrarCantidad();
		Integer cantidadObtenida2=cantidadObtenida+1;
		Assert.assertEquals(cantidadEsperada, cantidadObtenida2);
		miContador = null;		
	}

}