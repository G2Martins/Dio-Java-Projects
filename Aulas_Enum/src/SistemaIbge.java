public class SistemaIbge {
	public static void main(String[] args) 
    {
		//imprimindo os estados existentes no enum
		for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) 
        {
		   System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
		}
		
		//selecionando um estado a partir das opções disponíveis
		EstadoBrasileiro ufSelecionado = EstadoBrasileiro.PIAUI;
		
		System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
	}
}
