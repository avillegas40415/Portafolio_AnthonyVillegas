package TiendaAnthonyVillegas.demo.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;


@Data​
@Entity​
@Table(name="producto")
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id​
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Long idProducto;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;

    @ManyToOne​
    @JoinColumn(name="id_categoria")
    Categoria categoria;

    public Producto() {
    }


    /*public Producto(String descripcion, String detalle, double precio, int existencias, String imagen, boolean activo) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = imagen;
        this.activo = activo;
    }*/
    
    public Producto(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
    
    public Long getIdProducto() {
        return idProducto;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
     public String getDetalle() {
        return detalle;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getExistencias() {
        return existencias;
    }
    
    public boolean isActivo() {
        return activo;
    }
    
    public String getRutaImagen() {
        return rutaImagen;
    }
    
    //Prueba semana 8
    public void setRutaImagen(String rutaImagen){
        this.rutaImagen = rutaImagen;
    }

    // Si hay un setter
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    //Prueba semana 10
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;

    }
}

