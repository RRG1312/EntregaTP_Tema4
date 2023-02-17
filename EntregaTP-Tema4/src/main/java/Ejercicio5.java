import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void adivinoNumero(){
        Scanner teclado = new Scanner(System.in);
        Random rand  = new Random();
        boolean encontrado=false;
        //int numSecretro = (int)Math.floor(Math.random() * (100 - 0 + 1) + 0);
        int numElegido = (int)Math.floor(Math.random() * (100 - 0 + 1) + 0);
        System.out.println("Elige un numero del 1 al 100 luego presiona cualquer tecla");
        int mayor=100;
        int menor=0;
        while(!encontrado){
            System.out.println("Pruebo con "+numElegido+"¿Es mayor, menor o es el numero secreto(+/-/=)?");
            char pista = teclado.nextLine().charAt(0);
            switch (pista){
                case '+':
                    menor= numElegido;
                    numElegido = (int)Math.floor(Math.random() * (mayor - menor + 1) + menor);
                    break;
                case '-':
                    mayor=numElegido;
                    numElegido = (int)Math.floor(Math.random() * (mayor - menor + 1) + menor);
                    break;
                case '=':
                    encontrado=true;
                    break;
                default:
                    System.out.println("No has elegido una opcion valida");

            }
        }
        System.out.println("sabia que podria hacerlo, he ganado");
    }
}
