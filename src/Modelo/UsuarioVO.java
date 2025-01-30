package Modelo;

public class UsuarioVO {

    private static int id;
    private String name;
    private String email;

    public UsuarioVO(int id, String name, String email) {
        UsuarioVO.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
