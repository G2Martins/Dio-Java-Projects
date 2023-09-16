import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		terminal.close();   

        try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}	
	}
	
    // Método
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException 
    {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois)
        {
          throw new ParametrosInvalidosException();
        }

		int contagem = parametroDois - parametroUm;
		
        for(int indice = 0; indice < contagem; indice++){
            System.out.println("Contagem N° " + (indice + 1));
        }
	}
}