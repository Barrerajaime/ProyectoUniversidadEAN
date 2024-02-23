import java.util.ArrayList;

public class UniversidadEAN {
    private String nombre = "Universidad EAN";
    private String nombreRector = "Brigitte Baptiste";
    private String ciudad = "Bogotá, Colombia";
    private ArrayList<Facultad> facultades;

    public UniversidadEAN() {
        this.facultades = new ArrayList<>();
        // Inicializar con facultades predeterminadas
    }
}
