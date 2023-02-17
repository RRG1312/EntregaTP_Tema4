import java.util.Scanner;

public class Ejercicio1 {
    public static void notaMedia(){
        Scanner teclado = new Scanner(System.in);
        int numeroNotas,res=0;

        System.out.println("Dime cuantos valores vas a introducir: ");
        numeroNotas = teclado.nextInt();

        for (int i=0;i<numeroNotas;i++){
            res+= teclado.nextInt();
        }
        res/=numeroNotas;
        System.out.println("La nota media es: "+res);
    }
}
