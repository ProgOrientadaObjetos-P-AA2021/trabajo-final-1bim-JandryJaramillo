package paquete05;

import java.io.Serializable;
import paquete01.Propietario;
import paquete02.Ubicacion;
import paquete03.Ciudad;
import paquete04.Constructora;

public class Casa implements Serializable {
    
    private Propietario propietario;
    private double precioM2;
    private double númeroM2;
    private double costoFinal;
    private Ubicacion ubicación;
    private Ciudad ciudad;
    private int númeroCuartos;
    private Constructora constructora;
    
    public Casa(Propietario p,double pm,double nm,Ubicacion u,
            Ciudad c,int nc,Constructora cs){
        propietario = p;
        precioM2 = pm;
        númeroM2 = nm;        
        ubicación = u;
        ciudad = c;
        númeroCuartos = nc;
        constructora = cs;
    }
    
    public void establecerPropietario(Propietario p) {
        propietario = p;
    }
    
    public void establecerPrecioM2(double pm) {
        precioM2 = pm;
    }
    
    public void establecerNúmeroM2(double nm) {
        númeroM2 = nm;
    }
    
    public void establecerCostoFinal(double cf) {
        costoFinal = cf;
    }
    
    public void establecerUbicación(Ubicacion u) {
        ubicación = u;
    }
    
    public void establecerCiudad(Ciudad c) {
        ciudad = c;
    }
    
    public void establecerNúmeroCuartos(int nc) {
        númeroCuartos = nc;
    }
    
    public void establecerConstructora(Constructora cs) {
        constructora = cs;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public double obtenerPrecioM2() {
        return precioM2;
    }
    
    public double obtenerNúmeroM2() {
        return númeroM2;
    }
    
    public double obtenerCostoFinal() {
        return costoFinal;
    }
    
    public Ubicacion obtenerUbicación() {
        return ubicación;
    }
    
    public Ciudad obtenerCiudad() {
        return ciudad;
    }
    
    public int obtenerNúmeroCuartos() {
        return númeroCuartos;
    }
    
    public Constructora obtenerConstructora() {
        return constructora;
    }
    
    @Override
    public String toString() {
        return String.format("%s \n %.1f \n %.1f \n %.1f \n %s \n %s \n %d \n %s"
                , propietario.obtenerNombres(), precioM2, númeroM2,costoFinal, 
                ubicación.obtenerNombreBarrio() , ciudad.obtenerNombreCiudad(),
                númeroCuartos,constructora.obtenerNombreC());
    }    
}