/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

public class claseRombo {
    private int diagonalMayor;
    private int diagonalMenor;
    private int lado;

    public claseRombo(int diagonalMayor, int diagonalMenor, int lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public double CalcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public double CalcularPerimetro() {
        return 4 * lado;
    }
    
    static String limpiarCampo(){
        return "";
    }
    
}
