import java.util.Scanner;

public class CondicionalmenteRico {
  public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    
    int saldoTotal = scanner.nextInt();
    
    int valorSaque = scanner.nextInt();
    
    scanner.close();

    
    if(saldoTotal < valorSaque){
      System.out.println("Saldo insuficiente. Saque nao realizado!");
    }else if(saldoTotal >= valorSaque){
      saldoTotal = saldoTotal - valorSaque;
       System.out.println("Saque realizado com sucesso! Novo saldo: " + saldoTotal);
    }
  }
}