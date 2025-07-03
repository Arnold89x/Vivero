import java.util.Random;

public class PlantaInterior extends Planta {

    private String[] tipo_ambiente = {"Sombra", "Luz indirecta"};

    public PlantaInterior(String nombre_comun, String nombre_cientifico, float precio_base) {
        super(nombre_comun, nombre_cientifico, precio_base);
    }

    public String gettipo_ambiente() {
        Random random = new Random();
        int d = random.nextInt(2);
        return tipo_ambiente[d];
    }

}
