package monopoly;

public class Compra
{
    private Jugador jugador = null;
    private Calle calle = null;
    private int posicion=0;
    
    public Compra(Jugador jugador, Calle calle, int pos) 
    {
        this.jugador=jugador;
        this.calle = calle;
        posicion=pos;
    }

    public Jugador getJugador()
    {
        return jugador;
    }

    public void setJugador(Jugador jugador)
    {
        this.jugador = jugador;
    }

    public int getPosicion()
    {
        return posicion;
    }

    public void setPosicion(int posicion) 
    {
        this.posicion = posicion;
    }

    public Calle getCalle() 
    {
	return calle;
    }

    public void setCalle(Calle calle)
    {
	this.calle = calle;
    }
} 
