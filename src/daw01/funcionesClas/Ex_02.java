package daw01.funcionesClas;


public class Ex_02 {
    static String vocals(boolean mayusculas) {
        if (mayusculas == false) {
            return "AEIOU";
        }
        return "aeiou";
    }

    public static void main(String[] args) {
        System.out.println(vocals(false));
    }
}