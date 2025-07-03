public class Planta {

    private String nombre_comun;
    private String nombre_cientifico;
    private float precio_base;

    public Planta(String nombre_comun, String nombre_cientifico, float precio_base) {
        this.nombre_comun = nombre_comun;
        this.nombre_cientifico = nombre_cientifico;
        this.precio_base = precio_base;
    }

    public String getNombre_comun() {
        return nombre_comun;
    }

    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    public float getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(float nuevo_precio) {
        nuevo_precio = precio_base;
    }

    public void regar() {
        System.out.println("Regando la planta...");
    }

    public void regarI(){
        System.out.println("Regando "+nombre_comun+" con cuidado para no encharcar.");
    }

    public void regarE(){
        System.out.println("Regando "+nombre_comun+" abundantemente");
    }
}
