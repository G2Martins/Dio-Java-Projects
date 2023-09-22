public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusicial {

    // Aparelho Telefonico
    public void ligar(){
        System.out.println("Ligando para Luisa Massae");
    }
    
    public void atender(){
        System.out.println("Aceitar ou Recusar Chamada de voz?");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Ligando para correio de voz");
    }

    // Navegador Internet
    public void exibirPagina(){
        System.out.println("Exibindo Página Inicial");
    }
    public void AdicionarNovaAba(){
        System.out.println("Exibindo botao nova Aba, Abrindo nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Refresh page, press F5");
    }
    
    // Reprodutor Musical
    public void tocar(){
        System.out.println("Tocando musica");
    }
    public void pausar(){
        System.out.println("Musica pausada");
    }
    public void selecionarMusica(){
        System.out.println("Musica selecionada");
    }
}
