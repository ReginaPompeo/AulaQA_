import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calculadora.Calculadora;

public class CalculadoraTeste {

	private Calculadora calc;

	@BeforeEach
	public void inicializar() {
		this.calc = new Calculadora();
	}

	@Test
	void testSomar() {

		int a = 3;
		int b = 2;
		int resultado = calc.somar(a, b);

		assertEquals(a + b, resultado);
	}

	@Test
	void testSubtrair() {

		// Calculadora calc = new Calculadora();

		int a = 3;
		int b = 2;
		int resultado = calc.subtrair(a, b);

		assertEquals(a - b, resultado);
	}

	@Test
	void testMultiplicar() {

		// Calculadora calc = new Calculadora();

		int a = 3;
		int b = 2;
		int resultado = calc.multiplicar(a, b);

		assertEquals(a * b, resultado);
	}

	@Test
	void testDeveRetornarExceptionQuandoDividirPorZeror() {

		// Calculadora calc = new Calculadora();

		int a = 5;
		int b = 0;

		try {
			calc.dividir(a, b);
			fail("TESTE FALHOU: não retornou Exception");
		} catch (Exception e) {
			assertEquals(ArithmeticException.class, e.getClass());
		}
	}

	@Test
	void testDeveRetornarExceptionUsandoLambda() {
		int a = 5;
		int b = 0;

		assertThrows(ArithmeticException.class, () -> calc.dividir(a, b));

		}


@Test
void testMedia() {

	// Calculadora calc = new Calculadora();

	int a = 6;
	int b = 2;
	
	float resultado = calc.media(a, b);

	assertEquals((a + b)/2, resultado);
}

@Test
void testMediaMaisVariaveis() {

	// Calculadora calc = new Calculadora();

	int[] numeros = {1, 3, 6, 5};
	
	float resultado = calc.mediaVariaveis(numeros);

	assertEquals(15f/4f, resultado);
}
}