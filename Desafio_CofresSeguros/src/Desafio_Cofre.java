import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {
    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {
    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }
}

public class Desafio_Cofre 
{   
    public static void main(String[] args) 
    {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital") || tipoCofre.equalsIgnoreCase("Digital")) {
            int senha = scanner.nextInt();
            scanner.nextLine();
            int senhaTentativa = scanner.nextInt();
            scanner.nextLine();
            scanner.close();
            System.out.println("Tipo: Cofre Digital");
            System.out.println("Metodo de abertura: Senha");

            if(senhaTentativa == senha){
                System.out.println("Cofre aberto!");
            }else{
                System.out.println("Senha Incorreta!");
            }
        }
        
        if(tipoCofre.equalsIgnoreCase("fisico") || tipoCofre.equalsIgnoreCase("Fisico")){
            System.out.println("Tipo: Cofre Fisico");
            System.out.println("Metodo de abertura: Chave");
            scanner.close();
        }
    }
}
