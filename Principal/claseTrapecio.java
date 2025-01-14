/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

public class claseTrapecio {
    private int baseMayor;
    private int baseMenor;
    private int altura;
    private int lado1;
    private int lado2;

    public claseTrapecio(int baseMayor, int baseMenor, int altura, int lado1, int lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double CalcularArea() {
        return ((baseMayor + baseMenor) / 2) * altura;
    }

    public double CalcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }

    static String limpiarCampo(){
        return "";
    }
    
}
