import java.util.Scanner;

public class Ejercicio6 {
    public static void corregirAlgo(){
        Scanner teclado = new Scanner(System.in);
        int numIntento = 1;
        String valor="";
        final int MAX_INTENTOS=5;

        System.out.println("Cual es la capital de francia?:");
        valor = teclado.nextLine();

        while(!valor.toLowerCase().equals("paris") || MAX_INTENTOS-numIntento<0){
            System.out.println("Respuesta incorrecta");
            System.out.println("Solo quedan "+ (MAX_INTENTOS-numIntento)+" intentos");
            System.out.println("cual es la capital de francia");
            valor = teclado.nextLine();
        }

        if(MAX_INTENTOS-numIntento>=0){
            System.out.println("Bravo");
        }else{
            System.out.println("Revise sus conocimientos");
        }
    }
}
