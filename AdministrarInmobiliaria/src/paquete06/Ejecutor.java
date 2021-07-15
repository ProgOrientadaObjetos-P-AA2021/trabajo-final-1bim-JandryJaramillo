package paquete06;
import java.io.IOException;
import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) throws IOException {
        mostrarMostrarMenuPrincipal();
    }

    public static void mostrarMostrarMenuPrincipal() throws IOException {
        Scanner sc = new Scanner(System.in);
        String opcionPrincipal, opcionSecundaria;
        boolean salir = false;

        while (salir == false) {
            System.out.println("Administración Inmobiliaria");
            System.out.println("1.Ingresar registros");
            System.out.println("2.Mostrar registros");
            System.out.print("Escoga una opción(1 o 2) -> ");
            opcionPrincipal = sc.nextLine();

            System.out.println("1.Datos de propietario");
            System.out.println("2.Datos de ubicaciones casa");
            System.out.println("3.Datos de ubicaciones departamento");
            System.out.println("4.Datos de ciudades");
            System.out.println("5.Datos de constructoras");
            System.out.println("6.Datos de casas");
            System.out.println("7.Datos de departamentos");
            System.out.println("8.Salir");

            System.out.print("Escoga una opción-> ");
            System.out.println("");
            opcionSecundaria = sc.nextLine();

            if (opcionSecundaria == "8") {
                salir = true;   
            } else {
                Datos controlador = new Datos();
                controlador.ejecutable(opcionPrincipal, opcionSecundaria);

            }
        }
    }
}
