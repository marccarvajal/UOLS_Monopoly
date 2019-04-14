/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcc
 */
public class Casilla {
    private String tipo[] = { "calle" , "especial", "carcel", "salida" };
       private Calle esCalle = null; //lo son todos menos las calles especiales
       private Especial especial = null; // lo son todas menos las calles
       String unTipo = "";
       
    public String[] getTipo() 
    {
        return tipo;
    }

    public void setTipo(String[] tipo) 
    {
        this.tipo = tipo;
    }    
    
    public Calle getEsCalle()
    {
        return esCalle;
    }

    public void setEsCalle(Calle esCalle) 
    {
        this.esCalle = esCalle;
    }

    public Especial getEspecial()
    {
        return especial;
    }

    public void setEspecial(Especial especial) 
    {
        this.especial = especial;
    }

    public Casilla()
    {
        
    }

    @Override
    public String toString() 
    {
        return "Casilla{" + "tipo=" + tipo + ", esCalle=" + esCalle + ", especial=" + especial + '}';
    }

    public void setUnTipo(int i) 
    {
        unTipo=tipo[i];
    }
    
    public String getUnTipo()
    {
        return unTipo;
    }  

}
