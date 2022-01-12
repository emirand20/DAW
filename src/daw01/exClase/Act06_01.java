public class Act06_01 {
    public static void main(String[] args) {
        int a, b, c;

        a = (int) (Math.random() * 10);
        b = (int) (Math.random() * 10);
        c = (int) (Math.random() * 10);

        if (a == 1 || b == 1 || c == 1) {
            return;
        }
        System.out.println(a + "\n" + b + "\n" + c);
    }
}
