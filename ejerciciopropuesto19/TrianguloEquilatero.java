package ejerciciopropuesto19;

public class TrianguloEquilatero {
    int lado;
    TrianguloEquilatero(int lado){
    this.lado = lado;
    }
    
    double obetenerArea(){
        return (Math.pow(lado, 2)*Math.sqrt(3)) / 4;
        } 
    
    double obetenerAltura(){
        return (lado*Math.sqrt(3)) / 2;
        }
    
    double obetenerPerimetro(){
        return lado*3;
        } 
}
