package ejerciciopropuesto18;

public class Nomina {
    
    int codigo;
    String nombres;
    int horasTrabajadas;
    double valorHora;
    double porcentajeRetencion;
    
    Nomina(int horasTrabajadas, double valorHora, double porcentajeRetencion){
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.porcentajeRetencion = porcentajeRetencion;
    }
    
    double obtenerSalarioBruto(){
        return horasTrabajadas * valorHora;
    }
    double obtenerSalarioNeto(){
        return (horasTrabajadas * valorHora) - ((horasTrabajadas * valorHora) * (porcentajeRetencion / 100));
    }
}
