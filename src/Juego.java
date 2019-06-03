package monopoly;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Juego 
{
    final int NCASILLAS = 30;
    final int TURNOSCARCEL = 3;
    ArrayList<Calle> tablero = null;
    ArrayList<Jugador> jugadores = null;
    ArrayList<Compra> compraArray=null;
    Scanner sca = null;
	 
    public Juego(ArrayList jugadores,ArrayList tablero)
    {
        this.jugadores = jugadores;
        this.tablero = tablero;
        compraArray = new ArrayList();
    }
 
    public void jugar()
    {
        GestorCompraPaga gcp = new GestorCompraPaga();
        sca = new Scanner(System.in);
        Jugador jugador=null;
        int num = 0;
        String nombre = "";
        double dinero = 0.0f;
        int dados = 0;
        Banca banca= null;
        int pos = 0;
        banca = new Banca(1000.f,"Inicio");
        int turno = 0; // turnos en la carcel
        while (true)
        {
            Iterator<Jugador> itJug = jugadores.iterator();//jugadores=lista de jugadores
            while (itJug.hasNext())
            {
                jugador = (Jugador) itJug.next();// captura cada jugador de la lista
                if (jugador.isQuiebra()||jugador.isCarcel())
                {
                    //////////////// BLOQUE CARCEL ////////////
                    ///////////////////////////////////////////
                    if (jugador.isCarcel())
                    {
                        // si el jugador esta en carcel le quito un turno
                        turno=jugador.getTurnosCarcel();
                        turno=turno-1;
                        jugador.setTurnosCarcel(turno);
                        System.out.println("(Un jugador en la carcel, le quedan " + turno );
                         ///////////// sale de la carcel
                        if (turno==0)
                        {
                            System.out.println("LIBRE DE LA CARCEL");
                            jugador.setCarcel(false);
                            jugador.setPosicion(10);
                        }
                    }
                }
                else
                {
                    jugador.setEsMiTurno(true);
                    num = jugador.getNumJuga();
                    nombre = jugador.getNombre();
                    dinero= jugador.getDinero();
                    pos = jugador.getPosicion();
                    /////////////////////////////////////////// RECORRIDO PARA VER SI HAY ALGUIEN EN QUIEBRA
                    Iterator itQuiebra = jugadores.iterator();
                    int jugadoresQuedan = jugadores.size();
                    Jugador juega = null;
                    String juegaGana = null;
                    //mientras la lista de jugadores quebrados haya algo
                    while (itQuiebra.hasNext())
                    {
                        juega = (Jugador)itQuiebra.next(); // pillo si esta en quiebra 
                        if (juega.isQuiebra())
                                {
                                    System.out.println("estoy contando, un jugador menos ");
                                    jugadoresQuedan--;
                                }
                        else 
                        {// SI ES EL UNICO
                            juegaGana = juega.getNombre();
                        }
                    }
                    if (jugadoresQuedan==1)
                    {
                        System.out.println("YA TENEMOS GANADOOOOOOOOOOOOOOOR");
                        System.out.println("YA TENEMOS GANADOOOOOOOOOOOOOOOR");
                        System.out.println("YA TENEMOS GANADOOOOOOOOOOOOOOOR");
                        System.out.println(" >>>>>>>>>>>>>>>>> " + juegaGana);
                        System.out.println("YA TENEMOS GANADOOOOOOOOOOOOOOOR");
                        System.out.println("YA TENEMOS GANADOOOOOOOOOOOOOOOR");
                        System.exit(-1);
                    }
                    else
                    {
                        System.out.println("\n######## Turno de "+ nombre + ", num " + (num+1) + " dinero: "+dinero+" en la posicion: " + pos + " ---> tira dados" );
                        //sca.nextLine();
                        //dados = (int)(Math.random()*12)+1;
                        dados = Integer.parseInt(sca.nextLine()); // truco para meter lo que quiero que salga (PRUEBAS)
                        System.out.println("ooooooo Resultado "+ dados );
                        sca.nextLine();
                        //int pos = jugador.getPosicion();
                        pos = pos + dados;
                        // si el numero de casillas es mayor que la longitud del tablero, seguro que pasa por el origen y se resetea su pos
                        if (pos >= NCASILLAS)
                        {
                            System.out.println("Pasas por el origen.Recibes 20e " );
                            float dineroAhora = (float) jugador.getDinero();
                            jugador.setDinero(dineroAhora+20.0f);
                            ///// HACER LOS CALCULOS PARA EL PASO
                            pos = pos-NCASILLAS;
                        }
                        if (pos==10)
                        {
                            System.out.println("{{{{{{{ has caido en la carcel " + pos );
                            jugador.setCarcel(true);
                            jugador.setTurnosCarcel(TURNOSCARCEL);
                        }  
                        else
                        {
                            jugador.setPosicion(pos);
                            System.out.println("Estas en la casilla " + pos);
                            Calle calle = (Calle)tablero.get(pos); // recupero del tablero la calle y como se la posicion la busco
                            if (pos==0)
                            {
                                System.out.println("Estas en la casilla ORIGEN, no hay mas que hacer");   
                            }
                            else
                            {
                                gcp.compraOPaga(tablero, compraArray, jugador, pos, banca);
                                gcp.listaCompras(compraArray);     
                            }       
                        }
                    }
                }
            }
            System.out.println("siguiente vueltaaaaaaaaaaaaaaaaaaa");
            System.out.println("Si quieres salir del juego pulsa X, si no una tecla");
            String siono=sca.nextLine();
            if (siono.charAt(0)=='X')
            {
                System.exit(-1);
            }
        }
    }
}