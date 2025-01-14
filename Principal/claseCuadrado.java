/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

public class claseCuadrado {
    int lado;
    
    public claseCuadrado(int lado){
        this.lado = lado;
    }
    
    public double CalcularArea(){
        return lado*lado;
    }
    
    public double CalcularPerimetro(){
        return (4*lado);
    }

    static String limpiarCampo(){
        return "";
    }
}
