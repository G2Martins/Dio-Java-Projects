/*
 Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro, logo, 
 enquanto o valor dos doces não igualar a R$ 50,00 ele foi adicionando itens no carrinho.
 */
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) 
    {
        double mesada = 50.0;
            
        while(mesada > 0) 
        {
            Double valorDoce = valorAleatorio();
                
            if(valorDoce > mesada)
                    valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
            
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
            
            
    }
   private static double valorAleatorio()  //Método Gerador de valores aleatórios
   {
	return ThreadLocalRandom.current().nextDouble(2, 8); 
   }
}