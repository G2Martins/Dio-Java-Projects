public class Carro {
    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo Combustível");
    }
    private void confereCambio(){
        System.out.println("Conferindo Câmbio em P");
    }


}
