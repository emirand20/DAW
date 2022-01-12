import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame una letra cualquiera!");
        String letra = entrada.next();
        switch (letra){
            case "A":
                System.out.println("Es la primera letra mayuscula");
                System.out.println("Es la primera letra minuscula");
                break;
            case "a":
                System.out.println("És la primera lletra minúscula");
                System.out.println("És una vocal minúscula");
                break;
            case "Z":
                System.out.println("És la darrera lletra majúscula");
                break;
            case "z":
                System.out.println("És la darrera lletra minúscula");
                break;
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("És una vocal majúscula");
                break;
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("És una vocal minúscula");
                break;
            default:
                System.out.println("No m'agrada la lletra que has triat");
        }
    }
}
