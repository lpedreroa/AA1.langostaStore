package Modelo;

public class Articulo {
    private String codigo;
    private String descripcion;
    private float precioVenta;
    private float gastosEnvio;
    private int tiempoPrep;

    public Articulo(String codigo, String descripcion, float precioVenta, float gastosEnvio, int tiempoPrep){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precioVenta=precioVenta;
        this.gastosEnvio=gastosEnvio;
        this.tiempoPrep=tiempoPrep;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public float getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(float gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public int getTiempoPrep() {
        return tiempoPrep;
    }

    public void setTiempoPrep(int tiempoPrep) {
        this.tiempoPrep = tiempoPrep;
    }
}
