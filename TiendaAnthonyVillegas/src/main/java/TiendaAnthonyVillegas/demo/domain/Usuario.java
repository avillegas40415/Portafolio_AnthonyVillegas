package TiendaAnthonyVillegas.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name = "id_usuario")
    private Long idUsuario;
    private String username;
    private String password;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String rutaImagen;    
    private boolean activo;
    
    @OneToMany
    @JoinColumn(name="id_usuario")
    List<Rol> roles;
    
    public Long getIdUsuario(){
        return idUsuario;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public String getRutaImagen(){
        return rutaImagen;
    }
    
    public boolean isActivo() {
        return activo;
    }

    public List<Rol> getRoles() {
        return roles;
    }
    
}

