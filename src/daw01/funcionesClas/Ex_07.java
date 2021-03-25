package daw01.funcionesClas;

public class Ex_07 {
    static boolean consonante(String cons) {
        if (cons != "a" || cons != "e" || cons != "i" || cons != "o" || cons != "u"){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {

        System.out.println(consonante("a"));
    }
}
