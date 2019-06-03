package monopoly;

public class Banca 
{
    private double dinero = 0.0f;
    private String causaHistorico = "";

    public Banca(double dinero, String causaHistorico) 
    {
        this.dinero = dinero;
        this.causaHistorico = causaHistorico;
    }

    public double getDinero() 
    {
        return dinero;
    }

    public void setDinero(double dinero)
    {
        this.dinero = dinero;
    }

    public String getCausaHistorico() //Se ha efectuado un ingreso de dinero 20 ha salido dinero x.
    {
        return causaHistorico;
    }

    public void setCausaHistorico(String causaHistorico)
    {
        this.causaHistorico = causaHistorico;
    }
}