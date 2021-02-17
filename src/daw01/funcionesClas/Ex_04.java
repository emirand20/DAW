package daw01.funcionesClas;

public class Ex_04 {
    static int dau() {
        return (int) (Math.random() * 6) + 1;
    }

    static int dosDaus() {
        return dau() + dau();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 30 ; i++) {
            System.out.println("Tiro dos dados " + dosDaus());
        }
        }
    }