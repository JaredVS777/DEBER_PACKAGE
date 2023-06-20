import java.util.Scanner;

import conicas2.*;

import java.text.DecimalFormat;

public class main {
    public static void main(String[] args) {
        Elipse elipse1 = new Elipse(5, 7);
        circunferencia_grupo2 circu1 = new circunferencia_grupo2(5, 20);
        hiperbole hip = new hiperbole(3.35, 9.30);
        Parabola_Equipo2 parab = new Parabola_Equipo2(6, 14, 5, 9, 4);

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("----- MENU -----");
            System.out.println("1. Circunferencia");
            System.out.println("2. Elipse");
            System.out.println("3. Hiperbole");
            System.out.println("4. Parabola");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\t Circunferencia \t");
                    DecimalFormat formato = new DecimalFormat("#.##");//solo dos decimales
                    System.out.println("El area de la circunferencia es: " + formato.format(circu1.area_cir()));
                    System.out.println("El perimetro de la circunferencia es: " + formato.format(circu1.perimetro_cir()));
                    System.out.println("El angulo inscrito de la circunferencia es: " + formato.format(circu1.angulo_inscrito_cir()));

                    break;
                case 2:
                    System.out.println("\t Elipse \t");
                    DecimalFormat formato2 = new DecimalFormat("#.##");//solo dos decimales
                    System.out.println("El area de la elipse es: " + formato2.format(elipse1.area_elipse()));
                    System.out.println("El perimetro fr la elipse es: " + formato2.format(elipse1.perimetro_elipse()));

                    break;
                case 3:
                    System.out.println("\t Hiperbole \t");
                    System.out.println("La hiperbole es: ");
                    hip.variables();

                    break;
                case 4:
                    System.out.println("\t Parabola \t");
                    System.out.println("El vertice X es: " + parab.Parabola_Equipo2_VerticeX(4.5f, 3));
                    System.out.println("El vertice Y es: " + parab.Parabola_Equipo2_VerticeY(7.30f, 2, 8.3f));
                    System.out.println("La parabola es: ");
                    parab.Parabola_Equipo2_ImpVer();

                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

            System.out.println();
        }

        System.out.println("Fin del programa.");
    }
}

