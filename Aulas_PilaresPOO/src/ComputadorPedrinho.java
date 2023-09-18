public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="tlg"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
    }
}

/* 
		MSNMessenger msn = new MSNMessenger();
		System.out.println("MSN");
        msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessenger fbm = new FacebookMessenger();
		System.out.println("\nFacebook");
        fbm.enviarMensagem();
		fbm.receberMensagem();
		
		Telegram tlg = new Telegram();
        System.out.println("\nTelegram");
		tlg.enviarMensagem();
		tlg.receberMensagem();
		*/