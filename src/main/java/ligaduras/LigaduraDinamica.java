package ligaduras;
import java.util.Scanner;

/**
 *
 * @author LuisaLucio
 */
public class LigaduraDinamica {
    public static void main(String[] args) {
        /* Ejemplo de ligadura dinamica */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de c: ");
        int c = sc.nextInt();
        System.out.print("Introduce el valor de d: ");
        int d = sc.nextInt();

        System.out.println("El resultado de c+d es: "+ (c+d));
    }    
}
