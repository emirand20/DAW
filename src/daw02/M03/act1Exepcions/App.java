package M03.act1Exepcions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Juanma Sánchez
 */

public class App {
    private static Scanner entrada = new Scanner(System.in);

	private static int entrarId() {
		int id = 0;

		while (id == 0) {
			System.out.println("Entra la id (-1 final)");
			id = entrada.nextInt();
		}
		return id;
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

	public static void main(String[] args) {
		Paquet[] paquet = new Paquet[50];

		int id = entrarId();
		int nPaquets = 0;

		while (id != -1) {
			LocalDate data = entrarData();
			paquet[nPaquets] = new Paquet(id, data);
			nPaquets++;
			id = entrarId();
		}

		for (int i = 0; i < nPaquets; i++) {
			System.out.println(paquet[i]);
		}

	}
}
