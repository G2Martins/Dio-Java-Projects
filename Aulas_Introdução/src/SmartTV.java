/*
 public double somar(int num1, int num2){
        // Logica --> Finalidade do Método
        return ...;
    } 
 
    public void imprimir(String texto){
        // Logica --> Finalidade do Método
        // Aqui não precisa do Return
        // Pois nao será retornado nenhum resultado
 }
    // Throws Exception: Indica que o Método a ser utilizado
    // Poderá gerar uma exeção
    public double dividir(int dividendo, int divisor) throws Exception{}

    // Este Método não pode ser visto por outras clases no programa
    private void metodoPrivado(){}

    // Alguns Equívicos estruturais:
    public void validar(){
        // Este método deveria retornar algum valor
        // no caso boolean (True or False)
    }
    
    public void calcularEnviar(){
        // Um Método deve representar uma única Responsabilidade
    }

    public void gravarCliente(String nome, String cpf, Integer telefone, ....){
        //este método tem a finalidade de gravar
		//informações de um cliente, por que não criar
		//um objeto cliente e passar como parâmetro ?
		//veja abaixo:
    }

    public void gravarCliente(Cliente cliente){}
	//ou
	public void gravar(Cliente cliente){}
 */



/*
    Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
    1- Ela tenha as características: ligada (boolean), canal (int) e volume (int);
    2- Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
    3- Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
    4- Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
 */
public class SmartTV {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        ligada=true;
    }
    
    public void desligar(){
        ligada=false;
    }
    
    public void aumentarVolume(){
        volume++;
    }
    
    public void diminuirVolume(){
        volume--;
    }
    
    public void aumentarCanal(){
        canal++;
    }
    
    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}
