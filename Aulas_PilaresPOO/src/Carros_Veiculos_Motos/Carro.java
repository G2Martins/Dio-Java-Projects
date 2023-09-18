package Carros_Veiculos_Motos;
public class Carro extends Veiculo {
    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("CARRO LIGADO");
    }
    private String chassi;
    
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    private void confereCombustivel(){
        System.out.println("Conferindo Combustível");
    }
    private void confereCambio(){
        System.out.println("Conferindo Câmbio em P");
    }
}
