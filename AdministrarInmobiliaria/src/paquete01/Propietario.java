package paquete01;

import java.io.Serializable;

public class Propietario implements Serializable {
    
    private String nombres;
    private String apellidos;
    private String identificación;
    private String identificacion;
    
    public Propietario(String n,String a,String id){
        nombres = n;
        apellidos = a;
        identificación = id;
    }
    
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    public void establecerNombres(String n){
        nombres = n;
    }
    
    public void establecerApellidos(String a){
        apellidos = a;
    }
    
    public void establecerIdentificación(String id){
        identificación = id;
    }
    
    public String obtenerNombres (){
        return nombres;
    }
    
    public String obtenerApellidos (){
        return apellidos;
    }
    
    public String obtenerIdentificación (){
        return identificación;
    }
    
    public String toString() {
        return String.format("%s \n %s \n %s", identificación, nombres,
                apellidos);
    }
}