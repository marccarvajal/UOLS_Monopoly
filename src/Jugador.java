package monopoly;

import java.util.ArrayList;

public class Jugador 
{
    private String nombre = "";
    private int numJuga = 0;   
    private boolean jugando = false;
    boolean esMiTurno = false;
    double dinero = 0.0f;
    boolean quiebra = false;
    boolean carcel = false;
    
    public Jugador()
    {

    }

    public int getTurnosCarcel() 
    {
        return turnosCarcel;
    }

    public void setTurnosCarcel(int turnosCarcel) 
    {
        this.turnosCarcel = turnosCarcel;
    }
    int turnosCarcel = 3;

    public boolean isCarcel()
    {
        return carcel;
    }

    public void setCarcel(boolean carcel)
    {
        this.carcel = carcel;
    }
    
    public boolean isQuiebra()
    {
        return quiebra;
    }

    public void setQuiebra(boolean quiebra)
    {
        this.quiebra = quiebra;        
    }
    
    public int getPosicion() 
    {
        return posicion;
    }
    public void setPosicion(int posicion)
    {
        this.posicion = posicion;
    }

    int posicion = 0;
    
    public double getDinero() 
    {
        return dinero;
    }

    public void setDinero(double dinero)
    {
        this.dinero = dinero;
    }	

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getNumJuga()
    {
        return numJuga;
    }

    public void setNumJuga(int numJuga)
    {
        this.numJuga = numJuga;
    }
    
    public boolean isEsMiTurno()
    {
        return esMiTurno;
    }

    public void setEsMiTurno(boolean esMiTurno)
    {
        this.esMiTurno = esMiTurno;
    }

    public Jugador(String nombre, int num, boolean esMiTurno,boolean quiebra, boolean carcel)
    {
        this.nombre = nombre;
        this.numJuga=num;
        this.esMiTurno = esMiTurno;
        this.quiebra = quiebra;
        this.carcel=carcel;
        this.turnosCarcel=3;
    }

    public boolean isJugando()
    {
        return jugando;
    }

    public void setJugando(boolean jugando)
    {
        this.jugando = jugando;
    }   
}