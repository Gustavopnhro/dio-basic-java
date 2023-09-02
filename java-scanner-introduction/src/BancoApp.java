import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;


public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.00");
   
        double valorInicial = scanner.nextDouble();
        
     
        float taxaJuros = scanner.nextFloat();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial * Math.pow((1 +taxaJuros), periodo);

        



        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}