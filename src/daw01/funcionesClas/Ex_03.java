package daw01.funcionesClas;

public class Ex_03 {
    static int dau() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        System.out.println(dau());
    }
}
