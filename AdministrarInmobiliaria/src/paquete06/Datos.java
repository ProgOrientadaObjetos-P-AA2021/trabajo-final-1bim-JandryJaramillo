package paquete06;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import paquete01.Propietario;
import paquete02.Ubicacion;
import paquete03.Ciudad;
import paquete04.Constructora;
import paquete05.Casa;
import paquete05.Departamento;

public class Datos {

    Scanner sc = new Scanner(System.in);
    Ingreso serializador = new Ingreso();
    Recuperación deserializador = new Recuperación();

    public void ejecutable(String opcion1, String opcion2) 
            throws IOException {
        
        if (opcion1.equals("1")) {
            if (opcion2.equals("1")) {
                subirPropietario();
            } else if (opcion2.equals("2")) {
                subirUbicacionCasa();
            } else if (opcion2.equals("3")) {
                subirUbicacionDepar();
            } else if (opcion2.equals("4")) {
                subirCiudad();
            } else if (opcion2.equals("5")) {
                subirConstructora();
            } else if (opcion2.equals("6")) {
                subirCasa();
            } else if (opcion2.equals("7")) {
                subirDepartamento();
            }
        } else if (opcion1.equals("2")) {
            if (opcion2.equals("1")) {
                verPropietarios();
            } else if (opcion2.equals("2")) {
                verUbicacionesCasa();
            } else if (opcion2.equals("3")) {
                verUbicacionesDepar();
            } else if (opcion2.equals("4")) {
                verCiudades();
            } else if (opcion2.equals("5")) {
                verConstructoras();
            } else if (opcion2.equals("6")) {
                verCasas();
            } else if (opcion2.equals("7")) {
                verDepartamentos();
            }
        }

    }

    public void verPropietarios() throws IOException {
        int cantidadPropietarios = Integer.parseInt(id("propietario", false));
        for (int i = 1; i <= cantidadPropietarios; i++) {
            Propietario propietario = deserializador.deserializarPropietario(
                    Integer.toString(i), "propietario");               
            System.out.println("Nombres: " + propietario.obtenerNombres());
            System.out.println("Apellidos: " + propietario.obtenerApellidos());
            System.out.println("Identificación: " + propietario.obtenerIdentificación());
            System.out.println("");
        }
    }

    public void verUbicacionesCasa() throws IOException {
        int cantidadUbicaciones = Integer.parseInt(id("ubicacion", false));
        for (int i = 1; i <= cantidadUbicaciones; i++) {
            Ubicacion ubicacion = deserializador.deserializarUbicacionCasa(
                    Integer.toString(i), "ubicacion");            
            System.out.println("Barrio: " + ubicacion.obtenerNombreBarrio());
            System.out.println("Referencia: " + ubicacion.obtenerReferencia());            
            System.out.println("");
        }
    }
    
    public void verUbicacionesDepar() throws IOException {
        int cantidadUbicaciones = Integer.parseInt(id("ubicacion", false));
        for (int i = 1; i <= cantidadUbicaciones; i++) {
            Ubicacion ubicacion = deserializador.deserializarUbicacionDepar(
                    Integer.toString(i), "ubicacion");            
            System.out.println("Número de casa: " + ubicacion.obtenerNúmeroDeCasa()); 
            System.out.println("Barrio: " + ubicacion.obtenerNombreBarrio());
            System.out.println("Referencia: " + ubicacion.obtenerReferencia());                       
            System.out.println("");
        }
    }
    

    public void verCiudades() throws IOException {
        int cantidadCiudades = Integer.parseInt(id("ciudad", false));
        for (int i = 1; i <= cantidadCiudades; i++) {
            Ciudad ciudad = deserializador.deserializarCiudad(
                    Integer.toString(i), "ciudad");            
            System.out.println("Nombre ciudad: " + ciudad.obtenerNombreCiudad());
            System.out.println("Nombre provincia: " + ciudad.obtenerNombreProvincia());
            System.out.println("");
        }
    }

    public void verConstructoras() throws IOException {
        int cantidadConstructoras = Integer.parseInt(id("constructora", false));
        for (int i = 1; i <= cantidadConstructoras; i++) {
            Constructora constructora = deserializador.deserializarConstructora(
                    Integer.toString(i), "constructora");            
            System.out.print("Nombre de la constructora: "
                    + constructora.obtenerNombreC());
            System.out.print("Identificación: " + constructora.obtenerId());
            System.out.println("");
        }
    }

    public void verCasas() throws IOException {
        int cantidadCasas = Integer.parseInt(id("casa", false));

        for (int i = 1; i <= cantidadCasas; i++) {
            Casa casa = deserializador.deserializarCasa(Integer.toString(i), "casa");
            System.out.print("Propietario.-\nNombres: " + casa.obtenerPropietario().obtenerNombres()
            +"\nApellidos: "+casa.obtenerPropietario().obtenerApellidos()+
                    "\nID: "+casa.obtenerPropietario().obtenerIdentificación());
            System.out.print("Precio por metro cuadrado: " + casa.obtenerPrecioM2());
            System.out.print("Número de metros cuadrados: " + casa.obtenerNúmeroM2());
            System.out.print("Costo final: " + casa.obtenerCostoFinal());
            System.out.print("Ubicación.-\nNombre del barrio: " + casa.obtenerUbicación().obtenerNombreBarrio()
            +"\nReferencia: "+casa.obtenerUbicación().obtenerReferencia());
            System.out.print("Ciudad.-\nNombre de la ciudad: "+
                    casa.obtenerCiudad().obtenerNombreCiudad()+"\nNombre de la "
                            + "provincia: "+casa.obtenerCiudad().obtenerNombreProvincia());
            System.out.print("Número de cuartos: " + casa.obtenerNúmeroCuartos());
            System.out.print("Constructora.-\nNombre de la constructora "+
                    casa.obtenerConstructora().obtenerNombreC()+"ID: "+
                    casa.obtenerConstructora().obtenerId());
            System.out.println("");
        }
    }

    public void verDepartamentos() throws IOException {
        int cantidadCasas = Integer.parseInt(id("departamento", false));
        for (int i = 1; i <= cantidadCasas; i++) {
            Departamento departamento = deserializador.deserializarDepartamento(
                    Integer.toString(i), "departamento");
            System.out.print("Propietario.-\nNombres: " + departamento.obtenerPropietario().obtenerNombres()
            +"\nApellidos: "+departamento.obtenerPropietario().obtenerApellidos()+
                    "\nID: "+departamento.obtenerPropietario().obtenerIdentificación());
            System.out.print("Precio por metro cuadrado: " + departamento.obtenerPrecioM2());
            System.out.print("Número de metros cuadrados: " + departamento.obtenerNúmeroM2());
            System.out.print("Valor alícuota mensual: " + departamento.obtenerAlícuotaMensual());
            System.out.print("Costo final: " + departamento.obtenerCostoFinal());
            System.out.print("Precio: " + departamento.obtenerPrecio());
            System.out.print("Ubicación.-\nNúmero de casa: "+departamento.obtenerUbicación().obtenerNúmeroDeCasa()
                    + "Nombre del barrio: " + departamento.obtenerUbicación().obtenerNombreBarrio()
            +"\nReferencia: "+departamento.obtenerUbicación().obtenerReferencia());
            System.out.print("Ciudad.-\nNombre de la ciudad: "+
                    departamento.obtenerCiudad().obtenerNombreCiudad()+"\nNombre de la "
                            + "provincia: "+departamento.obtenerCiudad().obtenerNombreProvincia());
            System.out.print("Nombre del edificio: " + departamento.obtenerNombreEdificio());
            System.out.print("Ubicación del departamento en el edificio: "+
                    departamento.obtenerUbicaciónDepartamento());
            System.out.print("Constructora.-\nNombre de la constructora "+
                    departamento.obtenerConstructora().obtenerNombreC()+"ID: "+
                    departamento.obtenerConstructora().obtenerId());
            System.out.println("");
        }
    }

    public void subirPropietario() throws IOException {               
        System.out.println("Nombres: ");
        String nombres = sc.nextLine();
        System.out.println("Apellidos: ");
        String apellidos = sc.nextLine();      
        System.out.println("ID: ");
        String id = sc.nextLine();
        Propietario propietario = new Propietario(id, nombres, apellidos);
        id = id("propietario", true); 
        serializador.serializarPropietario(id, "propietario", propietario);
    }

    public void subirUbicacionCasa() throws IOException {
        String id = id("ubicacion", true);        
        System.out.println("Nombre del barrio: ");
        String barrio = sc.nextLine();
        System.out.print("\nReferencia: ");
        String referencia = sc.nextLine();        
        Ubicacion ubicacion = new Ubicacion(barrio, referencia);
        serializador.serializarUbicacionCasa(id, "ubicacion", ubicacion);
    }
    
    public void subirUbicacionDepar() throws IOException {
        String id = id("ubicacion", true);        
        System.out.print("Número de casa: ");
        String ncasa = sc.nextLine();  
        System.out.println("\nNombre del barrio: ");
        String barrio = sc.nextLine();
        System.out.print("\nReferencia: ");
        String referencia = sc.nextLine();        
        Ubicacion ubicacion = new Ubicacion(ncasa,barrio, referencia);
        serializador.serializarUbicacionDepar(id, "ubicacion", ubicacion);
    }

    public void subirCiudad() throws IOException {
        String id = id("ciudad", true);        
        System.out.println("Nombre de la ciudad: ");
        String nombreCiudad = sc.nextLine();
        System.out.println("Nombre de la provincia: ");
        String nombreProvincia = sc.nextLine();
        Ciudad ciudad = new Ciudad(nombreCiudad, nombreProvincia);
        serializador.serializarCiudad(id, "ciudad", ciudad);
    }

    public void subirConstructora() throws IOException {
        
        
        System.out.println("Nombre de la constructora: ");
        String nombreC = sc.nextLine();
        System.out.println("ID: ");
        String id = sc.nextLine();

        Constructora constructora = new Constructora(nombreC,id);
        id = id("constructora", true);
        serializador.serializarConstructora(id, "constructora", constructora);
    }

    public void subirCasa() throws IOException {
        String id = id("casa", true);     
        
        System.out.println("Nombre propietario_ ");
        String nombrep = sc.nextLine();
        System.out.println("Precio por metro cuadrado: ");
        String precioMetroCuadrado = sc.nextLine();
        System.out.println("Número de metros cuadrados: ");
        String metrosCuadrados = sc.nextLine();    
        System.out.println("Nombre del barrio_ ");
        String nBarrio = sc.nextLine();
        System.out.println("Nombre de la ciudad-");
        String nombreCiudad = sc.nextLine();
        System.out.println("Número cuartos: ");
        String numeroCuartos = sc.nextLine();        
        System.out.println("Nombre de la constructora_ ");
        String nombreC = sc.nextLine();

        Propietario propietario = obtenerPropietarioPorNombre(nombrep);
        Ubicacion ubicacion = obtenerUbicacionPorNombreBarrio(nBarrio);
        Ciudad ciudad = obtenerCiudadPorNombre(nombreCiudad);
        Constructora constructora = obtenerConstructoraPorNombre(nombreC);

        Casa casa = new Casa(propietario, Double.parseDouble(precioMetroCuadrado),
                Double.parseDouble(metrosCuadrados),ubicacion,ciudad,
        Integer.parseInt(numeroCuartos),constructora);
        casa.obtenerCostoFinal();

        serializador.serializarCasa(id, "casa", casa);
    }

    public void subirDepartamento() throws IOException {
        String id = id("departamento", true);
        
        System.out.println("Nombre propietario_ ");
        String nombrep = sc.nextLine();
        System.out.println("Precio por metro cuadrado: ");
        String precioMetroCuadrado = sc.nextLine();
        System.out.println("Número de metros cuadrados: ");
        String metrosCuadrados = sc.nextLine(); 
        System.out.println("Valor alícuota mensual: ");
        String amensual = sc.nextLine();
        System.out.println("Precio: ");
        String p = sc.nextLine();
        System.out.println("Nombre del barrio_ ");
        String nBarrio = sc.nextLine();
        System.out.println("Nombre de la ciudad-");
        String nombreCiudad = sc.nextLine();
        System.out.println("Nombre del Edificio: ");
        String nombreE = sc.nextLine();
        System.out.println("Ubiación del departamento en el edificio: ");
        String ubiDepar = sc.nextLine();                
        System.out.println("Nombre de la constructora_ ");
        String nombreC = sc.nextLine();

        Propietario propietario = obtenerPropietarioPorNombre(nombrep);
        Ubicacion ubicacion = obtenerUbicacionPorNombreBarrio2(nBarrio);
        Ciudad ciudad = obtenerCiudadPorNombre(nombreCiudad);
        Constructora constructora = obtenerConstructoraPorNombre(nombreC);

        Departamento departamento = new Departamento(propietario, 
                Double.parseDouble(precioMetroCuadrado),Double.parseDouble(metrosCuadrados),
                Double.parseDouble(amensual),Double.parseDouble(p),ubicacion,ciudad,
                nombreE,ubiDepar,constructora);
        departamento.obtenerCostoFinal();

        serializador.serializarDepartamento(id, "departamento", departamento);
    }

    public Propietario obtenerPropietarioPorNombre(String nombres) throws IOException {
        Propietario propietario = null;
        int cantidadPropietarios = Integer.parseInt(id("propietario", false));
        for (int i = 1; i <= cantidadPropietarios; i++) {
            Propietario prop = deserializador.deserializarPropietario(
                    Integer.toString(i), "propietario");            
            if (prop.obtenerNombres() == nombres) {
                propietario = prop;
            }
        }
        return propietario;
    }

    public Ubicacion obtenerUbicacionPorNombreBarrio(String nBarrio) throws IOException {
        Ubicacion ubicacion = null;
        int cantidadUbicaciones = Integer.parseInt(id("ubicacion", false));
        for (int i = 1; i <= cantidadUbicaciones; i++) {
            Ubicacion ub = deserializador.deserializarUbicacionCasa(
                    Integer.toString(i), "ubicacion");
            if (ub.obtenerNombreBarrio() == nBarrio) {
                ubicacion = ub;
            }
        }
        return ubicacion;
    }
    
    public Ubicacion obtenerUbicacionPorNombreBarrio2(String nBarrio) throws IOException {
        Ubicacion ubicacion = null;
        int cantidadUbicaciones = Integer.parseInt(id("ubicacion", false));
        for (int i = 1; i <= cantidadUbicaciones; i++) {
            Ubicacion ub = deserializador.deserializarUbicacionDepar(
                    Integer.toString(i), "ubicacion");
            if (ub.obtenerNombreBarrio() == nBarrio) {
                ubicacion = ub;
            }
        }
        return ubicacion;
    }

    public Ciudad obtenerCiudadPorNombre(String nombre) throws IOException {
        Ciudad ciudad = null;
        int cantidadCiudades = Integer.parseInt(id("ciudad", false));
        for (int i = 1; i <= cantidadCiudades; i++) {
            Ciudad cd = deserializador.deserializarCiudad(
                    Integer.toString(i), "ciudad");
            if (cd.obtenerNombreCiudad().equals(nombre)){
                ciudad = cd;
            }
        }
        return ciudad;
    }

    public Constructora obtenerConstructoraPorNombre(String nombreC) throws IOException {
        Constructora constructora = null;
        int cantidadConstructoras = Integer.parseInt(id("constructora", false));
        for (int i = 1; i <= cantidadConstructoras; i++) {
            Constructora con = deserializador.deserializarConstructora(
                    Integer.toString(i), "constructora");
            if (con.obtenerNombreC() == nombreC) {
                constructora = con;
            }
        }
        return constructora;
    }

    public String id(String nombreArchivo, boolean modificar) {

        String dir = System.getProperty("user.dir") + "\\datos\\" + nombreArchivo + "\\id.txt";
        String id = "";

        try {
            Scanner lectorArchivos = new Scanner(new File(dir));
            id = lectorArchivos.nextLine();

            lectorArchivos.close();
            int idNumerico = 0;
            if (modificar == true) {
                idNumerico = Integer.parseInt(id) + 1;
                id = Integer.toString(idNumerico);

                FileWriter escritorArchivos = new FileWriter(dir);
                escritorArchivos.write(id);
                escritorArchivos.close();

            } else {
                idNumerico = Integer.parseInt(id);
                id = Integer.toString(idNumerico);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return id;
    }

}
