import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void adivinaNumero(){
        Scanner teclado = new Scanner(System.in);
        Random rand  = new Random();
        boolean encontrado=false;
        int numSecretro = (int)Math.floor(Math.random() * (100 - 0 + 1) + 0);
        int numElegido;
        System.out.println("Elige un numero del 1 al 100 a ver si adivinas");

        while(!encontrado){
            numElegido = teclado.nextInt();
            if(numElegido==numSecretro){
                encontrado=true;
            }
            if(numElegido>numSecretro){
                System.out.println("menor");
            }else{
                System.out.println("mayor");
            }

        }
        System.out.println("Bien has ganado el numero era: "+numSecretro);
    }
}
