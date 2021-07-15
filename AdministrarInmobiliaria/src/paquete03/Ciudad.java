package paquete03;

import java.io.Serializable;

public class Ciudad implements Serializable {
    
    private String nombreCiudad;
    private String nombreProvincia;
    
    public Ciudad (String nciu,String npro){
        nombreCiudad = nciu;
        nombreProvincia = npro;        
    }
        
    public void establecerNombreCiudad(String nciu){
        nombreCiudad = nciu;
    }
    
    public void establecerNombreProvincia(String npro){
        nombreProvincia = npro;
    }
    
    public String obtenerNombreCiudad (){
        return nombreCiudad;
    }
    
    public String obtenerNombreProvincia (){
        return nombreProvincia;
    }  
    
    public String toString() {
        return String.format("%s \n %s \n", nombreCiudad, nombreProvincia);
    }
    
}