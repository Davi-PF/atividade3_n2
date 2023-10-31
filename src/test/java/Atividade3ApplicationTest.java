import com.example.atividade3.Atividade3Application;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Atividade3ApplicationTest {
    @Test
    public void testNumeroUnico() {
        int resultado = Atividade3Application.digitalRoot(7);
        assertEquals(7, resultado);
    }

    @Test
    public void testNumeroDoisDigitos() {
        int resultado = Atividade3Application.digitalRoot(16);
        assertEquals(7, resultado);
    }

    @Test
    public void testNumeroTresDigitos() {
        int resultado = Atividade3Application.digitalRoot(942);
        assertEquals(6, resultado);
    }

    @Test
    public void testZero() {
        int resultado = Atividade3Application.digitalRoot(0);
        assertEquals(0, resultado);
    }
}
