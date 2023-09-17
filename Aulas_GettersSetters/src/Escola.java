public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		Aluno gustavo = new Aluno();

        felipe.setNome("Felipe Junior");
		felipe.setIdade(12);
        gustavo.setNome("Gustavo Martins");
        gustavo.setIdade(20);
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
        System.out.println("O aluno " + gustavo.getNome() + " tem " + gustavo.getIdade() + " anos ");	
	}
}