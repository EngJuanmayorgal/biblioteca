
package Modelo;

import java.util.ArrayList;


public class LectorVO extends UsuarioVO {
    
    private ArrayList<PrestamoVO> prestamos;

    public LectorVO(ArrayList<PrestamoVO> prestamos, int id, String name, String email) {
        super(id, name, email);
        this.prestamos = prestamos;
    }

    public ArrayList<PrestamoVO> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<PrestamoVO> prestamos) {
        this.prestamos = prestamos;
    }

  
    
}
