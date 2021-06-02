package paquete02;

import java.io.Serializable;

public class Ubicacion implements Serializable {
    
    private String númeroDeCasa;
    private String nombreBarrio;
    private String referencia;
    
    public Ubicacion (String nb,String r){
        nombreBarrio = nb;
        referencia = r;        
    }
    
    public Ubicacion (String nc,String nb,String r){
        númeroDeCasa = nc;
        nombreBarrio = nb;
        referencia = r;        
    }
        
    public void establecerNúmeroDeCasa(String nc){
        númeroDeCasa = nc;
    }
    
    public void establecerNombreBarrio(String nb){
        nombreBarrio = nb;
    }
    
    public void establecerReferencia(String r){
        referencia = r;
    }
    
    public String obtenerNúmeroDeCasa (){
        return númeroDeCasa;
    }
    
    public String obtenerNombreBarrio (){
        return nombreBarrio;
    }
    
    public String obtenerReferencia (){
        return referencia;
    } 
    
    public String toString() {
        return númeroDeCasa + "\n" + nombreBarrio + "\n" + referencia + "\n";
    }
    
}