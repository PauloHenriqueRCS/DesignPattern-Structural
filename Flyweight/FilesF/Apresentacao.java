package FilesF;

import java.util.*;

public class Apresentacao {

	private List<Slide> slides = new ArrayList<Slide>();

	public void adicionaSlide(Slide slide) {
		slides.add(slide);
	}

	public void imprime() {
		for (Slide slide : this.slides) {
			slide.imprime();
			System.out.println();
		}
	}

}
