package com.lagm.ejemplo1.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IndexControllerTest {
	@Test
	@DisplayName(value = "Test1 -> Resultado al pasar un array null")
	public void test1() {
		IndexController indexController = new IndexController();
		String[] paramArray = null;
		String resultadoEsperado = "El array está vacío";
		String resultadoReal = indexController.welcome(paramArray);

		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	public void test2() {
		IndexController indexController = new IndexController();
		String[] paramArray = new String[3];
		String resultadoEsperado = "param[0]null\n" + "param[1]null\n" + "param[2]null\n";
		String resultadoReal = indexController.welcome(paramArray);

		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	public void test3() {
		IndexController indexController = new IndexController();
		String[] paramArray = new String[]{"Java", "desde", "0"};
		String resultadoEsperado = "param[0]Java\n" + "param[1]desde\n" + "param[2]0\n";
		String resultadoReal = indexController.welcome(paramArray);

		assertEquals(resultadoReal, resultadoEsperado);
	}
}
