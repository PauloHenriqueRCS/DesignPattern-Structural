package FilesC;

import java.util.*;

public class Caminho implements Trecho {

	private List<Trecho> trechos;

	public Caminho() {
		this.trechos = new ArrayList<Trecho>();
	}

	public void adiciona(Trecho trecho) {
		this.trechos.add(trecho);
	}

	public void remove(Trecho trecho) {
		this.trechos.remove(trecho);
	}

	@Override
	public void imprime() {
		for (Trecho trecho : this.trechos) {
			trecho.imprime();
		}
	}

}
