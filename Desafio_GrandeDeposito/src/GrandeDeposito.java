import java.util.Scanner;
import java.text.DecimalFormat;

public class GrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        scanner.close();
        DecimalFormat df = new DecimalFormat("0.00");

        if (valor > 0) {
            System.out.println("Deposito realizado com sucesso!\r\nSaldo atual: R$ " + df.format(valor));
        } else if (valor == 0) {
            System.out.println("Encerrando o programa...");
        } else {
             System.out.println("Valor invalido! Digite um valor maior que zero.");
        }
    }
}