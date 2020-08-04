
package vistacontrol;
import modelo.alumno;
public class principal {
    public static void main(String[] args) {
        alumno alumno = new alumno();
        alumno alumno1 = new alumno(2, "29392423","retamozo");
        
        //asignamos valores al objeto alumno
        alumno.setIdalumno(1);
        alumno.setCodigo("2014100571");
        alumno.setNombre("Retamozo Taya");
        
        //obtenemos y mostramos los valores del objeto alumno
        System.out.println("objeto: alumno");
        System.out.println("ID: " + alumno.getIdalumno());
        System.out.println("Codigo: " + alumno.getCodigo());
        System.out.println("Nombre: " + alumno.getNombre());   
        
        //obtenemos y mostramos los valores del objeto alumno
        System.out.println("objeto: alumno1");
        System.out.println("ID: " + alumno1.getIdalumno());
        System.out.println("Codigo: " + alumno1.getCodigo());
        System.out.println("Nombre: " + alumno1.getNombre()); 
    }
}
