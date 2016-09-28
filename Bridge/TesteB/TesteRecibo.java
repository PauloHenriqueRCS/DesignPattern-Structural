package TesteB;

import java.util.*;

import FilesB.*;

public class TesteRecibo {

	public static void main(String[] args) {

		GeradorDeArquivo geradorDeArquivoTXT = new GeradorDeArquivoTXT();
		Recibo recibo = new Recibo("Serpro ", "Paulo Henrique Rodrigues ", 777777, geradorDeArquivoTXT);
		recibo.geraArquivo();
		
		// Ler Recibos;
		String diretorio = "arquivo.txt";
		List <String> lista = new ArrayList<>();
		FileRead read = new FileRead();
		read.Read(diretorio, lista);
	}

}
