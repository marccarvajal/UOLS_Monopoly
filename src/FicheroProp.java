import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

// Esta clase carga  un fichero tokenizado [cadena,numero,numero] las Propiedades y las envía y carga a las Calles del tablero 
class FicheroProp 
{
	File file = null;
	BufferedReader br = null;
	//caracter que uso como separador en el fichero y que ire a buscar con un StringTokenizer
	final String  CARACTER=",";
	//nombre de la calle (1er token)
	String nombreProp="";
	//hace el proceso de carga, entra el Array tablero y arrastra un booleano que dira si saco por consola o no los listados
	void cargaEnMemoria(ArrayList tablero, boolean listados) 
	{
		try 
		{
			// instancia un File con una ruta dentro de un File Reader (queremos leer) y dentro de un Buffered (quiero leer lineas)
			br = new BufferedReader(new FileReader(new File("c:\\ADE\\Propiedades.txt"))) ;
			String linea = "";
			String coste, pagar ="";
			String nombre = "";
			// lee el fichero, cada linea se carga en "linea", mientras sea distinto de NULL
			int a = 0;
			while ((linea=br.readLine())!=null)
			{
				System.out.println("linea del fichero_______");
				// instancia un tokenizer para leer de bloque en bloque (vease [calle,compra,pagarAlcaer]
				StringTokenizer st = new StringTokenizer(linea,CARACTER);
				// (dentro de la linea leida) mientras haya mas tokens....
				while (st.hasMoreTokens())
				{ // consigo mis 3 variables
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
					calle.setPosicion(a);
					calle.setPagarAlCaer(pagarF);
					System.out.println("-----> es calle "+ nombreProp);
					// cargo el tablero con cada calle ya construida
					tablero.add(calle);
				}
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
	}
}