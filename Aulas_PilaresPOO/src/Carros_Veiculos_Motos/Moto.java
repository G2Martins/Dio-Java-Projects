package Carros_Veiculos_Motos;
public class Moto extends Veiculo {
    public void ligar(){
        confereCombustivel();
        System.out.println("MOTO LIGADA");
    }
    
    private void confereCombustivel()
    {
        System.out.println("Conferindo Combustível");
    }
}
