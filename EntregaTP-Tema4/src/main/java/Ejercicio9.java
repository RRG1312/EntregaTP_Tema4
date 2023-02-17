import java.util.Scanner;

public class Ejercicio9 {
    public static void multiploDeTres(){
        Scanner teclado = new Scanner(System.in);
        int num =7;
        while(!(num%3==0)){
            System.out.println("dime un numero multiplo de tres:");
            num = teclado.nextInt();
        }
        System.out.println("Okey "+num+" es un multiplo de 3");
    }
}
