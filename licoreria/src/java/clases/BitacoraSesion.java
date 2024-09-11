
package clases;
import java.util.Date;


public class BitacoraSesion {
    
    private int id;
    private Usuario id_usuario;
    private Date f_inicio;
    private Date f_fin; 

    public BitacoraSesion(int id, Usuario id_usuario, Date f_inicio, Date f_fin) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.f_inicio = f_inicio;
        this.f_fin = f_fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Date getF_inicio() {
        return f_inicio;
    }

    public void setF_inicio(Date f_inicio) {
        this.f_inicio = f_inicio;
    }

    public Date getF_fin() {
        return f_fin;
    }

    public void setF_fin(Date f_fin) {
        this.f_fin = f_fin;
    }
    
    
    
    
    
}
