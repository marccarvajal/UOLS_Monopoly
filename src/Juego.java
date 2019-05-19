
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Juego {
 	 final int NCASILLAS = 30;
         final int CARCEL = 5;
	 //final double DINEROJUG = 50.0f;
	 //boolean listadosB=true;  
	
	ArrayList<Calle> tablero = null;
	ArrayList<Jugador> jugadores = null;
	ArrayList<Compra> compraArray=null;
	ArrayList<Banca> bancaArray=null;
	
	Scanner sca = null;
	 
 public Juego(ArrayList jugadores,ArrayList tablero, boolean listadosB)
 {
	this.jugadores = jugadores;
	this.tablero = tablero;
	compraArray = new ArrayList();
	listadosB = listadosB;
    bancaArray=new ArrayList(); 
 }
 
 public void jugar()
 {
	 sca = new Scanner(System.in);
	 Jugador jugador=null;
	 int num = 0;
	 String nombre = "";
	 double dinero = 0.0f;
	 int dados = 0;
	 Banca banca= null;
	 
	 banca = new Banca(1000.f,"Inicio",false);
	 
	 bancaArray.add(banca);
	 
	 System.out.println("\n########JUGANDO");
	 sca.nextLine();
	 while (true)
	 {
             Iterator<Jugador> itJug = jugadores.iterator();
	 
	 while (itJug.hasNext())
	 {
             
		 jugador = itJug.next();
		 
		 jugador.setEsMiTurno(true);
		 num = jugador.getNumJuga();
		 nombre = jugador.getNombre();
		 dinero= jugador.getDinero();
		 System.out.println("######## Turno de "+ nombre + " " + num + " "+dinero+" tira dados" );
		 dados = (int)(Math.random()*12)+1;
		 System.out.println("ooooooo Resultado "+ dados);
		 int pos = jugador.getPosicion();
		 pos = pos + dados;
		 
		 if (pos >= NCASILLAS)
		 {
			 System.out.println("Pasas por el origen.Recibes 20e " );
			 float dineroAhora = (float) jugador.getDinero();
			 jugador.setDinero(dineroAhora+20.0f);
	         ///// HACER LOS CALCULOS PARA EL PASO
                         pos = pos-NCASILLAS;
			 
		 }
		 
                 jugador.setPosicion(pos);
			 System.out.println("Estas en la casilla " + pos);
		     
			 
			
			 compraOPaga(tablero, compraArray, jugador, pos, banca);
                         listaCompras(compraArray);     
	                         
		 }
         
	 System.out.println("siguiente vueltaaaaaaaaaaaaaaaaaaa");
	 System.out.println("Si quieres salir pulsa X, si no una tecla");
	 String siono=sca.nextLine();
	 if (siono.charAt(0)=='X')
		 System.exit(-1);
        
         
	 }
 }
 
 private void compraOPaga(ArrayList tablero,ArrayList compraArray,Jugador jugador,int pos, Banca banca) {
	    Calle calle = (Calle)tablero.get(pos);
	    double coste = calle.getCoste();
	    double pagaSiCae = calle.getPagarAlCaer();
	    double dineroBanca=0.0f;
	    // si calle NO esta comprada
	    if (calle.isEstaCompr()==false)
	    {
	    	System.out.println("Calle para la compra ------->>>>> " + calle.getNombreCalle()+"  coste   "+ calle.getCoste() + " si alguien cae" + calle.getPagarAlCaer()+ " // casilla:  "+ pos );
	    	String siono = sca.nextLine();
                // La consola recoge el valor
		    if (siono.charAt(0)=='S')
		    {
		    	double suDinero = jugador.getDinero();
                        // puede comprarla?
		    	if (suDinero > coste)
		    	{
		    		//comprar
		    		jugador.setDinero(suDinero-coste);
		    		// A EXTINGUIRSystem.out.println("oooooo COMPRA"+ jugador.getCallesProp().size());
		    		boolean estaCompr2 = true; // ARREGLO 
		    		calle.setEstaCompr(estaCompr2);
		    		// Banca
		    		dineroBanca = banca.getDinero();
		    		dineroBanca-=coste;
		    		if (dineroBanca<0.0f)
		    		{
		    			banca.isEnQuiebra();
		    			System.out.println("QUIEBRA DE BANCA ooooooooooooooooooo");
		    			System.exit(-1);
		    		}
		    		banca.setDinero(dineroBanca);
		    		banca.setCausaHistorico("Compra aprobada " + calle.getNombreCalle()+"  coste   "+ calle.getCoste() + jugador.getNombre());
		    		Compra compra= new Compra(jugador,calle, pos);
		    	    compraArray.add(compra);
                        }
                        else System.out.println("NO PUEDES COMPRAR POR FALTA DE DINERO");
                }
                    
            } else {
                System.out.println("ESTA COMPRADA, LO SIENTO, VAS A TEner que PAGAR");
                // pueden pasar varias cosas: es de otro o es suya y hay que localizar quien es el dueño
                //quienDuenyo(calle,jugador ,compraArray);
                
                
            }
 }
   
 private void listaCompras(ArrayList compraArray)
 {
	 Iterator it = compraArray.iterator();
         System.out.println("TENEMOS " + compraArray.size()+ " COMPRAS");
	 System.out.println("_____________COMPRAS_____________");
	 while (it.hasNext())
	 {
		 Compra compra = (Compra)it.next();
		 System.out.println("CALLE casilla " + compra.getPosicion()  +" " + compra.getCalle().getNombreCalle()+"  " + compra.getCalle().getCoste() + " // JUGADOR   "+ compra.getJugador().getNombre());
	 }
	 System.out.println("________________________________");
 }
 
 private void listaBanca()
{
	 Iterator it = bancaArray.iterator();
	 System.out.println("_____________COMPRAS_____________");
	 while (it.hasNext())
	 {
		 Banca banca = (Banca)it.next();
		 System.out.println(banca.getDinero()+ "   " + banca.getCausaHistorico());
	 }
	 System.out.println("________________________________");
}
}
