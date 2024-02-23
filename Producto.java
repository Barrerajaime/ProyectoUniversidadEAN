public class Producto {
    private int codigo;
    private String nombre;
    private String tipo; // Ejemplos: ESPRESSO, LATTE, CAPPUCCINO
    private String fechaExpiracion;
    private String nombreFabricante = "Café de Colombia";
    private int cantidadInventario;
    private double precioUnitario;

    public Producto(int codigo, String nombre, String tipo, String fechaExpiracion, int cantidadInventario, double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaExpiracion = fechaExpiracion;
        this.cantidadInventario = cantidadInventario;
        this.precioUnitario = precioUnitario;
    }
}
