package monopoly;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Monopoly
{
    Jugador jugador = null;
    final double DINEROJUG = 300.0f;
    boolean listadosB=true;
    ArrayList tablero=null;
    ArrayList jugadores=null;
    public static void main(String[] args)
    {
        // TODO code application logic here
    	Monopoly pm = new Monopoly();
    	pm.inicio();
    }
    
    public void inicio()
    {    	
        tablero = new ArrayList(); // lo instancio
        jugadores = new ArrayList(); // lo instancio
        Scanner sca = new Scanner(System.in); // System.in es el teclado
        String nombre = "";
        String njug = "";
        //System.out.printf("###########\n1.- CON LISTADOS INTERACTIVOS? true/false");
        //listadosB=sca.nextBoolean();
        System.out.printf("###########\n1.- Numero de jugadores\n");
        njug= sca.nextLine();
        int njugI = Integer.parseInt(njug);
        for (int a = 1; a<=njugI; a++) // recorro 
        {
            jugador = new Jugador();
            jugador.setPosicion(0);
            jugador.carcel = false;
            System.out.println("Dame el nombre " + a);
            nombre = sca.nextLine();
            jugador.setNombre(nombre);
            if (a == 0)
            {
                jugador.setEsMiTurno(true);
            }                            
            else 
            {
                jugador.setEsMiTurno(false);
            }
            jugador.setJugando(true);
            //System.out.println("DINERO PARA ESTE JUGADOR ");
            //double dineroJug = sca.nextDouble();
            jugador.setDinero(DINEROJUG);
            System.out.println("dado de alta jugador");
            jugadores.add(jugador);
        }
        FicheroPropiedad fichP = new FicheroPropiedad();
        fichP.cargaEnMemoria(tablero);
        Juego juego = new Juego(jugadores,tablero);
        juego.jugar();
    }
    
    private void lista_tablero()
    {
    	Calle calle = null;
    	int a = 0;
    	Iterator it=tablero.iterator();
    	System.out.println("##### TABLERO");
    	while (it.hasNext()) 
    	{
            calle= (Calle)it.next();
            System.out.printf(calle.getNombreCalle()+" "+calle.getPosicion()+" %.2f //", calle.getCoste());
        }    	  
    }          
}