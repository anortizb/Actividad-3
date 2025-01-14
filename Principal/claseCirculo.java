/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

public class claseCirculo {
    int radio;
    
    public claseCirculo (int radio){
        this.radio = radio;   
        
    }
    
    public double CalcularArea(){
        return Math.PI*radio*radio;
    }
    public double CalcularPerimetro(){
        return 2*Math.PI*radio;
    }
    
    static String limpiarCampo(){
        return "";
    }
    
}
