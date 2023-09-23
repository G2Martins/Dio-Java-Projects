import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);

        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();
        scanner.close(); // Fecha o scanner

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);
        System.out.format("Informacoes:\nConta: %d\nTitular: %s\nSaldo: R$ %.1f", conta.numero, conta.titular, conta.saldo);
    }

}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) 
    {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}