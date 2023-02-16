import java.util.Scanner;

public class Ejercicio11 {
    public static void formas(){
        menu();
    }

    public static void menu(){
        int opcion,tamaño;
        char caracter;
        Scanner teclado = new Scanner(System.in);
        System.out.println("dime el tamaño de la forma:");
        tamaño = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Dime el caracter:");
        caracter = teclado.nextLine().charAt(0);

        System.out.println("Elige una de las siguientes forma:");
        System.out.println("1- Rectangulo relleno");
        System.out.println("2- Rectangulo sin relleno");
        System.out.println("3- Triangulo rectangulo");
        System.out.println("4- Cruz de san andres");
        System.out.println("5- Rombo");
        System.out.println("6- Ajedrezeado");
        opcion = teclado.nextInt();

        switch(opcion){
            case 1:
                rectanguloRelleno(tamaño,caracter);
                break;
            case 2:
                rectanguloSinRelleno(tamaño,caracter);
                break;
            case 3:
                trianguloRectangulo(tamaño,caracter);
                break;
            case 4:
                cruzSanAndres(tamaño,caracter);
                break;
            case 5:
                rombo(tamaño,caracter);
                break;
            case 6:
                ajedrezado(tamaño,caracter);
                break;
            default:
                System.out.println("Eso no es una opcion");

        }
    }

    public static void rectanguloRelleno(int tamaño,char caracter){
        for (int i = 0; i < tamaño; i++) {
            System.out.println("");
            for (int j = 0; j < tamaño; j++) {
                System.out.print(caracter);
            }
        }
    }
    public static void rectanguloSinRelleno(int tamaño,char caracter){
        for (int i = 0; i < tamaño; i++) {
            System.out.println("");
            for (int j = 0; j < tamaño; j++) {
                if((i==0 || i==tamaño-1)){
                    System.out.print(caracter);
                } else if (j==0 || j==tamaño-1) {
                    System.out.print(caracter);
                }else{
                    System.out.print(" ");
                }
            }
        }
    }
    public static void trianguloRectangulo(int tamaño,char caracter){
        for (int i = 0; i < tamaño; i++) {
            System.out.println("");
            for (int j = 0; j < tamaño; j++) {
                if(i==tamaño-1 || j==0){
                    System.out.print(caracter);
                } else if (i==j) {
                    System.out.print(caracter);
                }else{
                    System.out.print(" ");
                }
            }
        }
    }
    public static void cruzSanAndres(int tamaño,char caracter){
        for (int i = 0; i < tamaño; i++) {
            System.out.println("");
            for (int j = 0; j < tamaño; j++) {
                if(i==j){
                    System.out.print(caracter);
                } else if (i+j==tamaño-1) {
                    System.out.print(caracter);
                }else{
                    System.out.print(" ");
                }
            }
        }
    }
    public static void rombo(int tamaño,char caracter){
        for (int i = 0; i < tamaño; i++) {
            System.out.println();
            for (int j = 0; j < tamaño; j++) {
                if(i==tamaño/2){
                    System.out.print(caracter);
                } else if (j==tamaño/2) {
                    System.out.println(caracter);
                }else{
                    System.out.print(" ");
                }
            }
        }
    }
    public static void ajedrezado(int tamaño,char caracter){

    }


}
