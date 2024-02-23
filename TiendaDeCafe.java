import java.util.ArrayList;

public class TiendaDeCafe {
    private String nombre = "Café Internacional EAN";
    private String direccion = "Principal sede en Bogotá, Colombia, con sucursales alrededor del mundo";
    private String telefono = "+57 3232096190 CAFE";
    private ArrayList<Producto> productos;

    public TiendaDeCafe() {
        this.productos = new ArrayList<>();
        // Inicializar con productos predeterminados
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
}
