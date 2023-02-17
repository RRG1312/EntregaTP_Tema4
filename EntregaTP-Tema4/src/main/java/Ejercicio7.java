import java.util.Scanner;

public class Ejercicio7 {
    public static void citasPeliculas(){
        menu();

    }
    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        int eleccion=0;
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
                    System.out.println("Cuidado es una utentica carniceria");
                    break;
                case 2:
                    System.out.println("Mi nombre es 007");
                    break;
                case 3:
                    System.out.println("Pues nno se cual es esa peli");
                    break;
                case 4:
                    System.out.println("GRGRGRGGFRRRRRRRRRRRRRRR");
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
