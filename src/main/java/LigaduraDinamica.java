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
        double c = sc.nextInt();
        System.out.print("Introduce el valor de d: ");
        double d = sc.nextInt();

        System.out.println("El resultado de c+d es: "+ (c+d));
    }    
}
