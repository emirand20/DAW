package daw01.variables;

public class Ex01 {

    public static void main(String[] args) {
        String color = "Carbassa";
        double descompte = 13;
        double valorVell = 3051;
        boolean compoCoche = descompte >= 5 && color == "Carbassa" && valorVell >= 3000;
        System.out.println(compoCoche);
    }

}
