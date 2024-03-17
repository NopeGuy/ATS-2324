package poligono;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PoligonoTest {

    @Test
    void testFechada() {
        Poligono p = new Poligono();
        p.addPonto(new Ponto(1, 1));
        p.addPonto(new Ponto(2, 2));
        p.addPonto(new Ponto(3, 3));
        p.addPonto(new Ponto(1, 1));
        assertTrue(p.fechada());
    }

    @Test
    void testPerimetro() {
        Poligono p = new Poligono();
        p.addPonto(new Ponto(1, 1));
        p.addPonto(new Ponto(4, 5));
        p.addPonto(new Ponto(7, 9));
        p.addPonto(new Ponto(1, 1));
        assertEquals(14.0, p.perimetro());
    }

    @Test
    void testClone() {
        Poligono p1 = new Poligono();
        p1.addPonto(new Ponto(1, 1));
        p1.addPonto(new Ponto(2, 2));
        Poligono p2 = p1.clone();
        assertNotSame(p1, p2);
        assertEquals(p1, p2);
    }
}

