package control.objects;

public class Usuario {
    private int id;
    private String usuario;
    private String password;
    private String ultimaConexion;
    private int tipo;

    public Usuario(){}

    public Usuario(int id,String usuario, String password, String ultimaConexion, int tipo){
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.ultimaConexion = ultimaConexion;
        this.tipo = tipo;
    }

    public Usuario (Usuario u){
        id = u.id;
        usuario = u.usuario;
        password = u.password;
        ultimaConexion = u.ultimaConexion;
        tipo = u.tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUltimaConexion() {
        return ultimaConexion;
    }

    public void setUltimaConexion(String ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                ", ultimaConexion='" + ultimaConexion + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
