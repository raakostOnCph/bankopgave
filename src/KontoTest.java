import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest
{

    Konto konto = new Konto("nik", 0);

    @org.junit.jupiter.api.Test
    void getNavn()
    {
        assertEquals("nik", konto.getNavn());

    }


    @Test
    void inset()
    {
        assertEquals(100, konto.inset(100));
        assertEquals(100, konto.inset(-100));


    }
}