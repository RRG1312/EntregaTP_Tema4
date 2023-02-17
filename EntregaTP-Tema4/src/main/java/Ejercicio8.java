import java.util.Scanner;

public class Ejercicio8 {
    public static void citasPeliculas(){
        menu();

    }
    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        String[] citas1 = {"Cuidado es una autentica carniceria","no me se mas citas","tercera cita ciudad del miedo"};
        String[] citas2 = {"Me llamo 007","Me llamo james bond","No se como me llamo"};
        String[] citas3 = {"Te he hablado del rio ?","pues el rio esta tranquilito tu sabe","tercera cita del rio tranquilo"};
        String[] citas4 = {"GRGRGGGGGGRRRRRRRRRRRRR","No veas con chewaka se lo ha explicado","Yo soy tu padre"};
        int eleccion=0,random;
        while(eleccion!=5){
            System.out.println("1- Una cita de la ciudad del miedo");
            System.out.println("2-Una cita de James Bond");
            System.out.println("3-Una cita de la vida es un largo rio tranquilo");
            System.out.println("4-Una cita de Star Wars");
            System.out.println("5-Salir de esta magnifica aplicacion");
            eleccion=teclado.nextInt();

            switch (eleccion){
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println(citas1[random = (int)Math.floor(Math.random() * (3 - 1 + 1) + 1)]);
                    break;
                case 2:
                    System.out.println(citas2[random = (int)Math.floor(Math.random() * (3 - 1 + 1) + 1)]);
                    break;
                case 3:
                    System.out.println(citas3[random = (int)Math.floor(Math.random() * (3 - 1 + 1) + 1)]);
                    break;
                case 4:
                    System.out.println(citas4[random = (int)Math.floor(Math.random() * (3 - 1 + 1) + 1)]);
                    break;
                case 5:
                    System.out.println("Chau chau");
                    break;
                default:
                    System.out.println("Eso no es una oopcion");
                    break;
            }

        }

    }
}
