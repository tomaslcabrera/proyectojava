/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pedidos.modelos;

/**
 *
 * @author tomyl
 */
public enum Estados {
    CREADO,SOLICITADO,PROCESANDO,ENTREGADO;
    
    @Override
    public String toString(){
        switch (this) {
            case CREADO -> {
                return "CREADO";
            }
            case SOLICITADO -> {
                return "SOLICITADO";
            }
            case PROCESANDO -> {
                return "PROCESANDO";
            }
            case ENTREGADO -> {
                return "ENTREGADO";
            }
            default -> throw new AssertionError();
        }
    }
}
