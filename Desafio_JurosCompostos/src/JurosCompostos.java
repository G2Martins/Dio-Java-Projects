import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        double valorInicial = scanner.nextDouble();
        
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = calcularJurosCompostos(valorInicial, taxaJuros, periodo);

        DecimalFormat df = new DecimalFormat("0.00");
    
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }

    public static double calcularJurosCompostos(double valorInicial, double taxaJuros, int periodo){
        // Fórmula dos juros Compostos
        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);
        // Arrendoda para duas casas decimais
        return valorFinal;
    }

}