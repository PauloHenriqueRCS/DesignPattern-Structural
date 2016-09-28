package TesteC;

import FilesC.*;

public class TestaCaminho {

	public static void main(String[] args) {
		
		Trecho trecho1 = new TrechoAndando("Vá até o cruzamento da Av. Cristiano Machado com a Av. Contorno ", 2000);
		Trecho trecho2 = new TrechoDeCarro("Vá até o cruzamento da Av. Contorno com a Av. Amazonas ",1500);
		Trecho trecho3 = new TrechoDeCarro("Vire a direita na Av. Afonso Pena ", 500);
		
		Caminho caminho1 = new Caminho();
		caminho1.adiciona(trecho1);
		caminho1.adiciona(trecho2);

		System.out.println(" Caminho 1 : ");
		caminho1.imprime();

		Caminho caminho2 = new Caminho();
		caminho2.adiciona(caminho1);
		caminho2.adiciona(trecho3);
		
		System.out.println(" ---------------");
		System.out.println(" Caminho 2: ");
		caminho2.imprime();
	}

}
