package FilesAD;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControleDePontoNovo {

	public void registra(Funcionario f, boolean entrada) {
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat Date = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat Hour = new SimpleDateFormat("H:m:s");
		String formatDate = Date.format(calendar.getTime());
		String formatHour = Hour.format(calendar.getTime());
		

		if (entrada == true) {
			System.out.println(" Entrada.......\n Funcionário: " + f.getNome() + " \n Data: " + formatDate + "\n Hora: " + formatHour);
		} else {
			System.out.println(" Saída.......\n Funcionário: " + f.getNome() + " \n Data: " + formatDate + "\n Hora: " + formatHour);
		}
	}

}
