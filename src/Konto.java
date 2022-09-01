public class Konto
{

private String navn;
private int saldo;


    public Konto(String navn, int saldo)
    {
        this.navn = navn;
        this.saldo = saldo;
    }


    public Konto(String navn)
    {
        this.navn = navn;
        this.saldo = 0;
    }


    public String getNavn()
    {
        return navn;
    }

    public int getSaldo()
    {
        return saldo;
    }
}
