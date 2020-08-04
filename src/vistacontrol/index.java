package vistacontrol;
import utis.leer;
import java.util.ArrayList;
import modelo.Cliente;
public class index {
    // variables globales
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private static int idcliente = -1;
    
    public static void cargarDataSintetica(){
        Cliente cliente0 = new Cliente(0, "Jean Franco", "Retamozo Taya", "70029869", "11/02/1995");
        clientes.add(cliente0);
        
        Cliente cliente1 = new Cliente(1, "Rosa", "Florinda Meza", "20202020", "05/10/1990");
        clientes.add(cliente1);

        Cliente cliente2 = new Cliente(2, "Esteban", "Tocto Cano", "20102010", "25/11/1980");
        clientes.add(cliente2);

        Cliente cliente3 = new Cliente(3, "Saulo", "Tarso Quiroz", "10203040", "10/01/2010");
        clientes.add(cliente3);

        Cliente cliente4 = new Cliente(4, "Pedro", "Gonzales Siles", "50505050", "01/02/2003");
        clientes.add(cliente4);
        
        idcliente+=5;
                }
    public static void agregarclientes(){
       String nombre;
       String apellidos;
       String dni;
       String f_nacimiento;
       
        System.out.println("Agregar Clientes");
        System.out.print("Nombre: ");
        nombre = leer.cadena();
       
        System.out.print("Apellidos: ");
        apellidos = leer.cadena();
        
        do{
            System.out.print("Dni: ");
            dni = leer.cadena();
        }while (dniValido(dni)==false || esNumero(dni)==false || dniUnico(dni)==false);
        
        System.out.print("Fecha de Nacimiento: ");
        f_nacimiento = leer.cadena();
        idcliente++;
        Cliente cliente = new Cliente(idcliente, nombre, apellidos, dni, f_nacimiento);
        clientes.add(cliente);
        System.out.println("Resultado: Se agregó un cliente con éxito...");
    }
    public static boolean dniValido(String dni){
       boolean resultado;
       //tamaño 8;
       if (dni.length() == 8){
           resultado = true;
       }else{
           error(2);
           resultado = false;
       }
       return resultado;
    }
    public static boolean esNumero(String cadena){
        boolean resultado;
        try {
            //para determinar si esta compuesto por digitos
            //se debe poder convertir de string --> double
            Double.parseDouble(cadena);
            resultado = true;
        } catch (NumberFormatException nfe) {
            error(3);
            resultado = false;
        }
        return resultado;
    }
    public static boolean dniUnico(String dni){
        boolean resultado = true;
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                error(4);
                resultado = false;
                break;
            }
        }        
        return resultado;
    }
    public static void eliminarclientes(){
        int elemento;
        listarclientes();
        System.out.print("Indique la posición del elemento a eliminar: ");
        elemento = leer.entero();
        elemento--;
        clientes.remove(elemento);
        System.out.println("Resultado: Registro del Cliente Eliminado...");
    }
    public static void editarclientes(){
        int elemento;
        listarclientes();
        System.out.print("Indique la posición del elemento a editar: ");
        elemento = leer.entero();
        elemento--;
        System.out.println("Resultado: " + clientes.get(elemento).getObtenerNombreCompleto());
        System.out.print("Nuevo Nombre: ");
        clientes.get(elemento).setNombre(leer.cadena());
        System.out.print("Nuevos Apellidos: ");        
        clientes.get(elemento).setApellidos(leer.cadena());
        String dni;
        do {            
            System.out.print("Nuevo DNI: ");
            dni = leer.cadena();
        } while (dniValido(dni)==false || esNumero(dni)==false || dniUnico(dni)==false);
        clientes.get(elemento).setDni(dni);
        System.out.print("Nueva Fecha de Nacimiento: ");
        clientes.get(elemento).setF_nacimiento(leer.cadena());
        System.out.println("Resultado: Cliente editado correctamente");
    }  
    public static void listarclientes(){
        System.out.println("Listar Clientes");
        System.out.println("N°\nDNI\nF_Nacimiento\nApellidos y Nombres");
        int num = 0;
        for (Cliente cliente : clientes){
            num++;
            System.out.println(num + "\t" +cliente.getDni() + "\t" +cliente.getF_nacimiento() + "\t" +cliente.getObtenerNombreCompleto());    
        }
   }
    public static void salir(){
        System.out.println("Gracias por su visita"); 
   }
    public static void error(int tipo){
        switch(tipo){
            case 1: 
                System.out.println("Opcion Incorrecta");
                break;
            case 2:
                System.out.println(" - DNI debe tener 8 digitos");
                break;
            case 3:
                System.out.println(" - DNI debe ser compuesto por digitos");
                break;
            case 4:
                System.out.println(" - DNI se repite (pertenece a otra persona)");
                break;
            default:
                System.out.println("Error");
        }        
    }
    public static void menu(){
        System.out.println("Menu principal");
        System.out.println("1. Agregar Clientes");
        System.out.println("2. Eliminar Clientes");
        System.out.println("3. Editar Clientes");
        System.out.println("4. Listar Clientes");
        System.out.println("5. Salir");
        System.out.print("Escoja la opcion [1-5]: ");
        
   }
    public static void inicio(){
        cargarDataSintetica();
        int opcion;
        do{
            menu();
            opcion = leer.entero();
            switch(opcion){
                case 1:
                   agregarclientes();
                   break;
                case 2:
                   eliminarclientes();
                   break;
                case 3:
                   editarclientes();
                   break;
                case 4:
                   listarclientes();
                   break;
                case 5:
                   salir();
                   break;
                default:
                   error(1);
            }
        }while (opcion!=5);
   }
   
    public static void main(String[] args) {
       inicio(); 
    }
}
