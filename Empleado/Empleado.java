package Empleado;

public class Empleado {
    String nombreEmpleado;
    double salarioPorHora;
    int horasTrabajadas;
    
    public static double salarioMensual(double salarioPorHora, int horasTrabajadas){
        double salarioMensual;
        salarioMensual = salarioPorHora * horasTrabajadas;
  
        if (salarioMensual > 450000) {
            return salarioMensual;
        } else {
            return salarioMensual;
        }
    }
    
    public static String setNombre(String nombre){
        return nombre;
    }
}
