public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 17;

        if(valorSolicitado < saldo)
        {
            saldo = saldo - valorSolicitado;
            System.out.println("\nTransação Concluída com Sucesso!\n");
            System.out.println("\nSaldo Atual " + saldo );
        }else
        {
            System.out.println("\nSaldo insuficiente, Transação cancelada");
            System.out.println("\nSaldo Atual " + saldo );
        }
    }
}