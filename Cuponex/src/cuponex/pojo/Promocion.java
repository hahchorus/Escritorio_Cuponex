
package cuponex.pojo;

/**
 *
 * @author DELL
 */
public class Promocion {
    private Integer idPromocion;
private String nombre;
private String descripcion;
private String fechaInicio;
private String fechaFinal;
private String restriccion;
private Integer idTipoPromocion;
private String porcentajeDescuento;
private String costoPromocion;
private Integer idCategoria;
private Integer idEstatus;
private Integer idSucursal;

private String nombreCategoria;
private String nombreEstatus;
private String nombreSucursal;

private String datoBuscar;

public Promocion(){
    
}

    public Promocion(Integer idPromocion, String nombre, String descripcion, String fechaInicio, String fechaFinal, String restriccion, Integer idTipoPromocion, String porcentajeDescuento, String costoPromocion, Integer idCategoria, Integer idEstatus, Integer idSucursal, String nombreCategoria, String nombreEstatus, String nombreSucursal, String datoBuscar) {
        this.idPromocion = idPromocion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.restriccion = restriccion;
        this.idTipoPromocion = idTipoPromocion;
        this.porcentajeDescuento = porcentajeDescuento;
        this.costoPromocion = costoPromocion;
        this.idCategoria = idCategoria;
        this.idEstatus = idEstatus;
        this.idSucursal = idSucursal;
        
        this.nombreCategoria = nombreCategoria;
        this.nombreEstatus = nombreEstatus;
        this.nombreSucursal = nombreSucursal;
        
        this.datoBuscar = datoBuscar;
    }

    public Integer getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(Integer idPromocion) {
        this.idPromocion = idPromocion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(String restriccion) {
        this.restriccion = restriccion;
    }

    public Integer getIdTipoPromocion() {
        return idTipoPromocion;
    }

    public void setIdTipoPromocion(Integer idTipoPromocion) {
        this.idTipoPromocion = idTipoPromocion;
    }

    public String getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(String porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public String getCostoPromocion() {
        return costoPromocion;
    }

    public void setCostoPromocion(String costoPromocion) {
        this.costoPromocion = costoPromocion;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getNombreEstatus() {
        return nombreEstatus;
    }

    public void setNombreEstatus(String nombreEstatus) {
        this.nombreEstatus = nombreEstatus;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDatoBuscar() {
        return datoBuscar;
    }

    public void setDatoBuscar(String datoBuscar) {
        this.datoBuscar = datoBuscar;
    }
    
    


    
}
