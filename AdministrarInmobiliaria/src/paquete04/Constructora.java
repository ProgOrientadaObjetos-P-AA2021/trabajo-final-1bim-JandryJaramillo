package paquete04;

import java.io.Serializable;

public class Constructora implements Serializable {
    
    private String nombreC;
    private String id;    
    
    public Constructora (String c,String idc){
        nombreC = c;
        id = idc;        
    }
    
    public void establecerNombreC(String c){
        nombreC = c;
    }
    
    public void establecerId(String idc){
        id = idc;
    }
    
    public String obtenerNombreC (){
        return nombreC;
    }
    
    public String obtenerId (){
        return id;
    }
    
    public String toString() {
        return String.format("%s \n %s \n",nombreC,id);
    }    
}