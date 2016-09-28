package TesteD;

import FilesD.*;

public class TesteEmissorDecorator {

	public static void main ( String [] args ) {
		 String mensagem = "Paulo Henrique Rodrigues";
		
		 Emissor emissorCript = new EmissorDecoratorComCriptografia (new EmissorBasico () ) ;
		 emissorCript.envia( mensagem ) ;
		
		 Emissor emissorCompr = new EmissorDecoratorComCompressao (new EmissorBasico () ) ;
		 emissorCompr.envia( mensagem ) ;
		
		 Emissor emissorCriptCompr = new EmissorDecoratorComCriptografia ( new EmissorDecoratorComCompressao (new EmissorBasico () ) ) ;
		 emissorCriptCompr.envia( mensagem ) ;
		 }

}
