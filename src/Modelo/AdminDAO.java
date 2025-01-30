
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminDAO {

    private java.sql.Connection con;
    private Statement st;
    private ResultSet rs;

    public AdminDAO() {
        con = null;
        st = null;
        rs = null;
    }

    public boolean encontrarAdmin(String user, String pass) {
        String consulta = "SELECT admin_id FROM admin WHERE user = '" + user + "' AND pass = "+ pass;
        try {
            con = Connectiondb.connection();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            if (rs.next() ) {
                st.close();
                Connectiondb.disconnected();
                return true;
            } else {
                st.close();
                Connectiondb.disconnected();
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
  
}
