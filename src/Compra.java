public class Compra 
{
    Jugador jugador = null;
    Calle calle = null;
    
    public Compra(Jugador jugador, Calle calle) 
	{
        this.jugador=jugador;
        this.calle = calle;
    }

	public Jugador getJugador()
	{
		return jugador;
	}

	public void setJugador(Jugador jugador)
	{
		this.jugador = jugador;
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