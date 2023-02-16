import java.util.Scanner;

public class Ejercicio3 {
    public static void notaMedia(){
        Scanner teclado = new Scanner(System.in);
        int res=0,comparador=0,contador=0;
        int porcentaje=0,contadorMejoresNotas=0;

        while (comparador!=-1){
            System.out.println("¿Nota (-1 para terminar)?");
            comparador= teclado.nextInt();
            if(comparador==-1){
                break;
            }
            contador++;
            res+=comparador;
            if(comparador>=10){
                contadorMejoresNotas++;
                porcentaje=contadorMejoresNotas/contador;
            }
        }
        res/=contador;
        System.out.println("La nota media es: "+res+"("+ porcentaje +"% >=10)");
    }



}
