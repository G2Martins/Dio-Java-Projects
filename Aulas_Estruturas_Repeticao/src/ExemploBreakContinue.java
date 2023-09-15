public class ExemploBreakContinue {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			break; // nesse caso haverá um do laço de repetição
        // Continue;  Nesse caso ele pulará a execução do numero 3 na contagem, continuando a execução
		System.out.println(numero);
	}
    }
}