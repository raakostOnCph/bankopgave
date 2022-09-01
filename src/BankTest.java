import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest
{

    Bank bank = new Bank();

    Konto konto = new Konto("nik", 100);

    @Test
    void inset()
    {
        assertEquals(true, bank.inset(konto));
        assertEquals(false, bank.inset(konto));

    }

    @Test
    void findeKonto()
    {
        bank.inset(konto);
        assertEquals(konto, bank.findeKonto(konto.getNavn()));


        assertEquals(null, bank.findeKonto("palle") );
    }
}