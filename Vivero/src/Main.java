import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner pedir = new Scanner(System.in);

    String[] plantat = {"Helecho","Rosa"};
    String[] NombreCientifico = {"Pteridium aquilinum (L.) Kuhn","Rosáceas"};
    int[] Precio= {1000,5000};

    Planta[] planta = new Planta[plantat.length];

    for(int i=0;i<2;i++) {
        planta[i] = new Planta(plantat[i] + " - ", NombreCientifico[i] + " - ", Precio[i]);
        PlantaInterior plantaInterior = new PlantaInterior(plantat[i] + " - ", NombreCientifico[i] + " - ", Precio[i]);
        PlantaExterior plantaExterior = new PlantaExterior(plantat[i] + " - ", NombreCientifico[i] + " - ", Precio[i],true);
        System.out.println(planta[i].getNombre_comun());
        System.out.println(planta[i].getNombre_cientifico());
        System.out.println(planta[i].getPrecio_base());

        System.out.println("Desea cambiar el precio (1) Si (2) No");
        int desicion = pedir.nextInt();
        if(desicion==1)
        {
            System.out.println("Ingrese el precio");
            int precio= pedir.nextInt();
            planta[i].setPrecio_base(precio);
        }

        if(i==1){
            planta[i].regar();
            planta[i].regarI();
            System.out.println("Tipo de luz "+plantaInterior.gettipo_ambiente());
        }else{
            planta[i].regar();
            planta[i].regarE();
            System.out.println("Necesita sol directo "+plantaExterior.getNecesita_sol_directo());
        }
        System.out.println("----------------------------------------------------");
    }
}
}