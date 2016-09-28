package FilesB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileRead {

	public void Read(String diretorio, List<String> Dados) {
		FileReader Fileopen;
		BufferedReader BuffFileopen;
		try {
			Fileopen = new FileReader(diretorio);
			BuffFileopen = new BufferedReader(Fileopen);
			while (BuffFileopen.ready()) {
				String linha = BuffFileopen.readLine();
				// Dsesenvolvimento.
				while (linha != null) {
					Dados.add(linha);
					linha = BuffFileopen.readLine();
				}
			}
			BuffFileopen.close();
		} catch (FileNotFoundException erro) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", erro.getMessage());
		} catch (IOException erro) {
			System.err.printf("Erro: %s.\n", erro.getMessage());

		}
	}
}