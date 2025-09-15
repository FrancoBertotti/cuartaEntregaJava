
package cuartaentrega;

/**
 *
 * @author Franco
 */
public class CasoPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1246, "Franco Bert", "programador", 512650.45);
        Empleado e2 = new Empleado("Marcos Ger", "programador");
        Empleado e3 = new Empleado();
        System.out.println("Cantidad de empleados: "+ Empleado.mostrarTotalEmpleados());
            
        System.out.println("");
        System.out.println("Estado luego de crearlos: ");
        System.out.println(e1);      
        System.out.println(e2);      
        System.out.println(e3);   
        
        e2.actualizarSalario(420000.0);
        e3.actualizarSalario(1500000.0);
        System.out.println("");
        System.out.println("Estado luego de aumentar los salarios: ");
        System.out.println(e1);      
        System.out.println(e2);      
        System.out.println(e3);
         
        e2.setId(3577);
        e3.setNombre("Florencia Arg");
        e3.setPuesto("TL");
        e3.setId(1654);
        e2.actualizarSalario(20);

        System.out.println("");
        System.out.println("Estado luego de probar los sett: ");
        System.out.println(e1);      
        System.out.println(e2);      
        System.out.println(e3);       
        
        System.out.println("");
        System.out.println("Estado luego de probar los gett: ");
        System.out.println("Salario e1: "+e1.getSalario());
        System.out.println("ID e2: "+e2.getId());
        System.out.println("Nombre e3: "+e3.getNombre());
        System.out.println("Puesto e1: "+e1.getPuesto());
        
        
        
                
    }
    
}
