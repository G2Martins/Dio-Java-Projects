public class ExemploFor_Arrays {
public static void main(String[] args) {
	// Posição      =       0        1         2       3
    String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	for (int x=0; x < alunos.length; x++) 
    {
	    System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	}

}
}