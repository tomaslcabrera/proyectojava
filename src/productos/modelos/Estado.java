/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author tomyl
 */
public enum Estado {
    
    DISPONIBLE, NO_DISPONIBLE;
    
    
    /*private Estado(String disponibilidad){
        this.disponibilidad = disponibilidad;
    }*/
    
    @Override
    public String toString(){
        switch (this) {
            case DISPONIBLE -> {
                return "DISPONIBLE";
            }
            case NO_DISPONIBLE -> {
                return "NO DISPONIBLE";
            }
            default -> throw new AssertionError();
        }
    }
}
