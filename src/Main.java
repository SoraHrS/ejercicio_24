import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pesoa, pesob, pesoc;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Ingrese el peso de la esfera A: ");
        pesoa = sc.nextDouble();
        System.out.println("Ingrese el peso de la esfera B: ");
        pesob = sc.nextDouble();
        System.out.println("Ingrese el peso de la esfera C: ");
        pesoc = sc.nextDouble();

        if (pesoa>pesob && pesoa>pesoc){
            System.out.println("La esfera de mayor peso es A");
        }else if (pesob>pesoa && pesob>pesoc){
            System.out.println("La esfera de mayor peso es B");
        }else{
            System.out.println("La esfera de mayor peso es C");
        }
    }
}