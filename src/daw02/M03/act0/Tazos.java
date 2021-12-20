package M03.act0;

import java.time.LocalDate;
import java.util.Scanner;

public class Tazos {
    Scanner entrada = new Scanner(System.in);
    //Tazos[] tazos = new Tazos[50];

    public int id() {
        int id = 0;

        while (id == 0) {
            id = entrada.nextInt();
        }
        return id;
    }
    public void valor() {
        int valor;

        
    }
    public void alfabetic() {
        int id = id();
        String tLosSimpons = tazos;

        for (int i = 0; i < tazos; i++) {
            System.out.println(tazos[i]);
        }
    }

    private static LocalDate entrarData() {
		final DateTimeFormatter DATA_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataString;
		LocalDate data = null;

		System.out.println("Entra la data (dd/mm/aaaa)");
		dataString = entrada.next();
		data = LocalDate.parse(dataString, DATA_FORMAT);

		return data;
	}
}
