package monopoly;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

// Esta clase carga desde un fichero tokenizado [cadena,numero,numero] las Propiedades y las envía y carga a las Calles del tablero 
public class FicheroPropiedad 
{
     File file = null;
     BufferedReader br = null;
     //caracter que uso como separador en el fichero y que ire a buscar con un StringTokenizer
     final String  CARACTER=",";
     //nombre de la calle (1er token)
     String nombreProp="";
     
    //hago todo el proceso de carga, entra el Array tablero y voy arrastrando un booleano que dira si saco por consola o no los listados
    public void cargaEnMemoria(ArrayList tablero)
    {
        try 
        {
            // instancio un File con una ruta dentro de un File Reader (queremos leer) y dentro de un Buffered (quiero leer lineas)
            br = new BufferedReader(new FileReader(new File("c:\\Monopoly\\Propiedades.txt"))) ;
            String linea = "";
            String coste, pagar ="";
            ////////// IMAGINAMOS UN TABLERO COMO EL LEIDO EN PROPIEDADES.TXT
            String nombre = "";
            /////////////
            // voy leyendo el fichero, cada linea se carga en "linea", mientras sea distinto de NULL
            int contador = 0;
            //linea= br.readLine();
            // sacar los tokens linea a linea
            while ((linea=br.readLine())!=null)
            {
                System.out.println("linea del fichero_______");
                // instancio un tokenizer para leer de bloque en bloque (vease [calle,compra,pagarAlcaer]
                StringTokenizer st = new StringTokenizer(linea,CARACTER);
                // (dentro de la linea leida) mientras haya mas tokens....
                while (st.hasMoreTokens())  // lee los tokens del fichero xxx,yy,zz 
                { 
                    // consigo mis 3 variables
                     nombreProp =   st.nextToken();
                     coste = st.nextToken();
                     pagar = st.nextToken();
                     //////
                     //preparado para cargar en Calle
                     Calle calle = new Calle();
                     calle.setNombreCalle(nombreProp);
                     //System.out.printf("Valor: %.2f", coste );
                     double costeF = Float.valueOf(coste);
                     calle.setCoste(costeF);
                     double pagarF = Float.valueOf(pagar);
                     calle.setPosicion(contador);
                     calle.setPagarAlCaer(pagarF);
                     System.out.println("-----> es calle "+ nombreProp);
                     // voy cargando el tablero con cada calle ya construida
                     tablero.add(calle);
                     contador++;
                }
                //System.out.println("++++++ " + a);
            }
            // capturamos las excepciones de rigor
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("-----> ERROR FATAL. Fichero no encontrado ");
        }
        catch (IOException ioe)
        {
            System.out.println("-------> ERROR FATAL. Lectura fichero");
        }
         ///////// CALLE CON ORIGEN
        Calle casillaOrigen = new Calle();
        tablero.add(casillaOrigen);
    }
}

    