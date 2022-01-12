public class Act06_04 {
    public static void main(String[] args) {
        String [] abecedario = {"A" , "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        for (int i = 0; i < 4; i++) {
            int a = (int) (Math.random() * abecedario.length);
            System.out.println(abecedario[a]);
        }
    }
}
