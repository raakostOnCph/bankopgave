import static org.junit.jupiter.api.Assertions.*;

class KontoTest
{

    Konto konto = new Konto("nik", 1500);

    @org.junit.jupiter.api.Test
    void getNavn()
    {
        assertEquals("nik", konto.getNavn());


    }


}