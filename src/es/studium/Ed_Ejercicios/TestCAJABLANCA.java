package es.studium.Ed_Ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCAJABLANCA
{

	@Test
	void testEsValido1()
	{
		boolean resultadoEsperado = CAJABLANCA.validar("144443349M");
		boolean resultadoReal = true;
		assertEquals(resultadoEsperado, resultadoReal);

	}

	@Test
	void testEsValido2()
	{
		boolean resultadoEsperado = CAJABLANCA.validar("1234V");
		boolean resultadoReal = false;
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
