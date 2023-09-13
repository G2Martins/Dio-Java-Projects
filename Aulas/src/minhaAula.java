//+--------------------------------------------------------------------------------+
// final String BR = "Brasil";  Não pode ser alterada
// double PI = 3.14
// int ESTADOS_BRASILEIRO = 27
// int Ano_2000 = 2000
// System.out.prin("Olá Turma, Bem vindos ao curso de JAVA básico")
// Iniciar sempre com uma letra minúscula (Boa prática)
//+---------------------------------------------------------------------------------+
// Declaração inválida de variáveis
// +----ERRADO------+   //  +----Correto-----+
// int numero&um = 1;      int numero$um = 1;
// int 1numero = 1;        int numero1 = 1;
// int numero um = 1;      int numeroum = 1;
// int long = 1;           int longo = 1;
//+---------------------------------------------------------------------------------+
//  Declarar Métodos
// Estrutura:
// TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
// Exemplo:
// int somar (int numeroUm, int numero2)
// String formatarCep (long cep)
//+---------------------------------------------------------------------------------+
// Anatomia de Classe Aula 3
// Concatenar string formando o nome compleot
/*
public class MinhaClasse 
{
    
    public static void main (String [] args)
    {
        String primeiroNome = "Gustavo";
        String segundoNome = "Martins";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome)
    {
        return "Resultado do método" + primeiroNome.concat(" ").concat(segundoNome);
    }
} */
//+----------------------------------------------------------------------------------+
// Java Beans
/*
 Variáveis
 Mais cedo já aprendemos algumas regras de declaração de variáveis, mas agora iremos conhecer algumas sugestões de nomenclatura:
 Uma variável deve ser clara, sem abreviações ou definição sem sentido;
 Uma variável é sempre no singular, exceto quando se referir a um array ou coleção.
 Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.
 
 Não Recomendado:
 double salMedio = 1500.23  //variável abreviada, o que dificulta a compreensão
 String emails = "aluno@escola.com" //confuso se a variável seria um array ou único e-mail
 String myName = "JOSEPH" //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não 
 
 Recomendado:
 double salarioMedio=1500.23;
 String email ="aluno@escola.com";
 String [] emails = {"aluno@escola.com","professor@escola.com"}
 String meuNome = "JOSEPH" 
 
 Métodos:

 Os métodos deverão ser nomeados como verbos, através de uma mistura de letras minúsculas e maiúsculas. 
 Em princípio todas as letras que compõem o nome devem ser mantidas em minúsculo, 
 com exceção da primeira letra de cada palavra composta, a partir da segunda palavra. 
 Exemplos sugeridos para nomenclatura de métodos:
 
 somar(int n1, int n2){}

 abrirConexao(){}

 concluirProcessamento() {}

 findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada

 calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade

 */
//+----------------------------------------------------------------------------------+


public class minhaAula {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
