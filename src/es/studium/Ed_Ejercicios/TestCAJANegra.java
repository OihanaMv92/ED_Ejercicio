package es.studium.Ed_Ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCAJANegra
{

	@Test
	void testAplicarDescuento1()
	{
		Producto p = new Producto();
		p.setPrecio(100.0);
		p.aplicarDescuento(50);
		double resultadoEsperado = 50.0;
		assertEquals(p.getPrecio(), resultadoEsperado);
	}

	@Test
	void testAplicarDescuento2()
	{
		Producto p = new Producto();
		p.setPrecio(100.0);
		p.aplicarDescuento(-50);
		double resultadoEsperado = 100.0;
		assertEquals(p.getPrecio(), resultadoEsperado);
	}
	
	@Test
	void testAplicarDescuento3()
	{
		Producto p = new Producto();
		p.setPrecio(100.0);
		p.aplicarDescuento(105);
		double resultadoEsperado = 100.0;
		assertEquals(p.getPrecio(), resultadoEsperado);
	}
	
	//TEST PARA PRECIO
	
	@Test
	void testPrecio1()
	{
		Producto p = new Producto();
		p.setPrecio(100.0);
		double resultadoEsperado = 100.0;
		assertEquals(p.getPrecio(), resultadoEsperado);
	}
	
	@Test
	void testPrecio2()
	{
		Producto p = new Producto();
		p.setPrecio(-100.0);
		double resultadoEsperado = 100.0;
		assertEquals(p.getPrecio(), resultadoEsperado);
	}
	
	//TEST PARA IVA
	
	@Test
	void testSetIVA1()
	{
		Producto p = new Producto();
		p.setIVA(21);
		int resultadoEsperado = 21;
		assertEquals(p.getIVA(), resultadoEsperado);
	}
	
	@Test
	void testSetIVA2()
	{
		Producto p = new Producto();
		p.setIVA(10);
		int resultadoEsperado = 21;
		assertEquals(p.getIVA(), resultadoEsperado);
	}
	
	@Test
	void testSetIVA3()
	{
		Producto p = new Producto();
		p.setIVA(4);
		int resultadoEsperado = 21;
		assertEquals(p.getIVA(), resultadoEsperado);
	}
	
	@Test
	void testSetIVA4()
	{
		Producto p = new Producto();
		p.setIVA(4);
		int resultadoEsperado = 50;
		assertEquals(p.getIVA(), resultadoEsperado);
	}
}