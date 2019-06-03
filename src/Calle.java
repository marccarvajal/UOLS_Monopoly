package monopoly;

public class Calle 
{    
    @Override
    public String toString() 
    {
        return "CallesProp{" + "nombreCalle=" + nombreCalle + ", posicion=" + posicion + ", coste=" + coste + ", estaCompr=" + estaCompr + '}';
    }

    private String nombreCalle="";
    private int posicion = 0;
    private double coste = 0.0;
    private boolean estaCompr = false;
    private double pagarAlCaer = 0.0;

    public Jugador getMiDuenyo()
    {
        return miDuenyo;
    }

    public void setMiDuenyo(Jugador miDuenyo) 
    {
        this.miDuenyo = miDuenyo;
    }
    
    Jugador miDuenyo = null;
    
    public String getNombreCalle() 
    {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle)
    {
        this.nombreCalle = nombreCalle;
    }

    public double getPagarAlCaer()
    {
        return pagarAlCaer;
    }

    public void setPagarAlCaer(double pagarAlCaer)
    {
        this.pagarAlCaer = pagarAlCaer;
    }

    public int getPosicion()
    {
        return posicion;
    }

    public void setPosicion(int posicion) 
    {
        this.posicion = posicion;
    }

    public double getCoste()
    {
        return coste;
    }

    public void setCoste(double coste)
    {
        this.coste = coste;
    }

    public boolean isEstaCompr() 
    {
        return estaCompr;
    }

    public Calle(String nombre, int pos, double coste,boolean compr)
    {
        this.nombreCalle = nombre;
        this.posicion = pos;
        this.coste = coste;
        this.estaCompr = compr;
    }

    public void setEstaCompr(boolean estaCompr2)
    {
        this.estaCompr = estaCompr2;		
    } 
    
    public Calle() 
    {
        
    }
}