package paquete05;

import java.io.Serializable;
import paquete01.Propietario;
import paquete02.Ubicacion;
import paquete03.Ciudad;
import paquete04.Constructora;

public class Departamento implements Serializable {
    
    private Propietario propietario;
    private double precioM2;
    private double númeroM2;
    private double alícuotaMensual;
    private double costoFinal;
    private double precio;
    private Ubicacion ubicación;
    private Ciudad ciudad;
    private String nombreEdificio;
    private String ubicaciónDepartamento;
    private Constructora constructora;
    
    public Departamento(Propietario p,double pm,double nm,double am,double pr,
            Ubicacion u, Ciudad c, String ne, String ud, Constructora cr){
        
        propietario = p;
        precioM2 = pm;
        númeroM2 = nm;
        alícuotaMensual = am;       
        precio = pr;
        ubicación = u;
        ciudad = c;
        nombreEdificio = ne;
        ubicaciónDepartamento = ud;
        constructora = cr;
        
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
    
    public void establecerAlícuotaMensual(double am) {
        alícuotaMensual = am;
    }
    
    public void establecerCostoFinal() {
        costoFinal = (númeroM2 * precioM2) + (alícuotaMensual * 12);
    }
    
    public void establecerPrecio(double pr) {
        precio = pr;
    }
    
    public void establecerUbicación(Ubicacion u) {
        ubicación = u;
    }
    
    public void establecerCiudad(Ciudad c) {
        ciudad = c;
    }
    
    public void establecerNombreEdificio(String ne) {
        nombreEdificio = ne;
    }
    
    public void establecerUbicaciónDepartamento(String ud) {
        ubicaciónDepartamento = ud;
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
    
    public double obtenerAlícuotaMensual() {
        return alícuotaMensual;
    }
    
    public double obtenerCostoFinal() {
        return costoFinal;
    }
    
    public double obtenerPrecio() {
        return precio;
    }
    
    public Ubicacion obtenerUbicación() {
        return ubicación;
    }
    
    public Ciudad obtenerCiudad() {
        return ciudad;
    }
    
    public String obtenerNombreEdificio() {
        return nombreEdificio;
    }
    
    public String obtenerUbicaciónDepartamento() {
        return ubicaciónDepartamento;
    }
    
    public Constructora obtenerConstructora() {
        return constructora;
    }
    
    public String toString() {
        return String.format("%s \n %.1f \n %.1f \n %.1f \n %.1f \n %.1f \n %s "
                + "\n %s \n %s \n %s \n %s "
                , propietario.obtenerNombres(), precioM2, númeroM2, alícuotaMensual,
                costoFinal, precio, ubicación.obtenerNombreBarrio(), 
                ciudad.obtenerNombreCiudad(), nombreEdificio, ubicaciónDepartamento,
                constructora.obtenerNombreC());
    }
}
