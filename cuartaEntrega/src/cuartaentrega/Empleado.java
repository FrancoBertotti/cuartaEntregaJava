
package cuartaentrega;

/**
 *
 * @author Franco
 */
public class Empleado {
    private static int totalEmpleados = 0;
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    //constructor
        public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados ++;
    
    }
        
            //sobrecarga de constructor
    public Empleado(String nombre, String puesto){
        this(0, nombre, puesto, 0.0);
    }
    
    //sobrecarga de constructor
    public Empleado(){
        this("Sin nombre", "sin puesto");
    }
    
    //metodo
    public void actualizarSalario(double salario){
        this.salario += salario;
    }
    
    //sobrecarga metodo
    public void actualizarSalario(int porcentaje){
        actualizarSalario(salario * porcentaje / 100);
    }

    //setters y getters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }
    
    
    @Override
    public String toString() {
        return "Empleado{" + "id: " + id + ", nombre: " + nombre + ", puesto: " + puesto + ", salario: $" + salario + '}';
    }
    
    
}
