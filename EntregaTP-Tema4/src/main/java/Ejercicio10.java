import java.util.Scanner;

public class Ejercicio10 {
    public static void rectangulo(){
        Scanner teclado = new Scanner(System.in);
        int anchura,altura;
        char caracter;
        System.out.println("Anchura:");
        anchura = teclado.nextInt();
        System.out.println("Altura:");
        altura = teclado.nextInt();
        System.out.println("caracter:");
        caracter = teclado.nextLine().charAt(0);
        for (int i = 0; i <altura ; i++) {
            System.out.println("");
            for (int j = 0; j < anchura; j++) {
                System.out.print(caracter);
            }
        }
    }
}
