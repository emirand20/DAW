package uf5.act0;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Arrays;

public class Tazos{
    private static Scanner entrada = new Scanner(System.in);

    public int identificador() {
        int id = 0;

        while (id == -1) {
            id = entrada.nextInt();
        }
        return id;
    }
    public void valor() {
        int valor;
        //hemos de dar valor a cada uno de los tazos y clasificarlos
    }
    public void alfabetic() {  //ordenar los tazos por orden alfabetico
        String tazos = "Hola";
        char[] StringtoChar = tazos.toCharArray();
        Arrays.sort(StringtoChar);
        String SortedString = new String(StringtoChar);
        System.out.println(SortedString);
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
