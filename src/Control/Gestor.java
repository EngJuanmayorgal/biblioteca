package Control;

import Modelo.AdminDAO;
import Vista.VistaPrincipalApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class Gestor implements ActionListener {

    private VistaPrincipalApp vistaP;

    public Gestor() {
        CrearVistaP();
    }

    public void CrearVistaP() {
        vistaP = new VistaPrincipalApp();
        vistaP.BLibros.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("LIBROS".equals(e.getActionCommand())) {
            vistaP.CambiarPanel("AdminLibros");
          
        }
    }

}
