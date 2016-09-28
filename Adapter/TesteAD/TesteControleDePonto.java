package TesteAD;

import FilesAD.*;

public class TesteControleDePonto {



	public static void main(String[] args) throws InterruptedException {
		
		ControleDePonto controleDePonto = new ControleDePontoAdapter();
		Funcionario funcionario = new Funcionario(" Paulo Henrique Rodrigues ");
		controleDePonto.registraEntrada(funcionario);
		Thread.sleep(3000);
		controleDePonto.registraSaida(funcionario);
	}

}
