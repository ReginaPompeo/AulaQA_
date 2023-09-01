
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class AssertTest {

	@Test
	public void testAssertArrayEquals() {
		// compara arrays: pegar arrays e comparar bytes
		byte[] esperado = "teste".getBytes();
		byte[] atual = "teste".getBytes();
		assertArrayEquals(esperado, atual);
	}

	@Test
	public void testAssertEquals() {
		// compara duas strings
		assertEquals("text", "text");
	}

	@Test
	public void testAssertFalse() {
		// booleano: valida se objeto/condição é falso
		assertFalse(false);
	}

	@Test
	public void testAssertNull() {
		// Valida se objeto está retornando "null"
		assertNull(null);
	}
	
	@Test
	public void testAssertNotNull() {
		// Valida se objeto não está retornando valor "null"
		assertNotNull(new Object());
	}

	@Test
	public void testAssertSame() {
		// Validar assert Same "se objetos são os mesmos"
		Integer aNumber = Integer.valueOf(765);
		assertSame(aNumber, aNumber);
	}
	
	@Test
	public void testAssertNotSame() {
		// Valida se objetos não são os mesmos
		assertNotSame(new Object(), new Object());
	}

}
