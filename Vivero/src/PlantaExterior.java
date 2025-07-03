public class PlantaExterior extends Planta {

    private boolean necesita_sol_directo;

    public PlantaExterior(String nombre_comun, String nombre_cientifico, float precio_base,boolean necesita_sol_directo) {
        super(nombre_comun, nombre_cientifico, precio_base);
        this.necesita_sol_directo = necesita_sol_directo;
    }

    public boolean getNecesita_sol_directo(){
        return necesita_sol_directo;
    }

}
