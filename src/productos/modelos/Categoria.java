/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author tomyl
 */
public enum Categoria {
    ENTRADA,PLATO_PRINCIPAL,POSTRE;
    
    public String toString(){
        switch (this) {
            case ENTRADA -> {
                return "Entrada";
            }
            case PLATO_PRINCIPAL -> {
                return "Plato Principal";
            }
            case POSTRE -> {
                return "Postre";
            }
            default -> throw new AssertionError();
        }
    }
}
