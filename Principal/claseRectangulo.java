/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

public class claseRectangulo {
    int base, altura;
    
    public claseRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double CalcularArea(){
        return base*altura;
    }
    
    public double CalcularPerimetro(){
        return 2*(base+altura);
    }

    static String limpiarCampo(){
        return "";
    }    
}
