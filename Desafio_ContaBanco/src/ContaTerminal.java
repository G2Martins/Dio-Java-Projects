import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o Numero da Conta");
        int numero = scanner.nextInt();
        
        System.out.println("Digite sua Agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu Nome");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite seu Saldo");
        double saldo = scanner.nextDouble();

        // Fechando o scanner explicitamente
        scanner.close();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero +  " e seu saldo " + saldo + " já está disponível para saque!");
    
    }
}
