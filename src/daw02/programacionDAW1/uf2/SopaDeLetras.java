package programacionDAW1.uf2;

public class SopaDeLetras {
    private String[] words;
    private String[][] soup;

    public void sopa(){
        soup = new String[][]{
                {"p","a","t","a","t","a","i","u","o","b"},
                {"i","n","t","a","t","b","n","i","o","l"},
                {"z","c","o","m","i","v","t","a","a","u"},
                {"z","l","a","p","i","z","e","f","w","s"},
                {"a","a","l","o","l","a","r","t","t","p"},
                {"a","l","t","a","v","o","n","w","f","l"},
                {"i","t","a","a","h","u","e","v","o","u"},
                {"r","a","n","v","e","n","t","a","a","s"},
                {"e","v","e","n","t","a","n","a","a","a"},
                {"c","o","m","i","c","s","u","p","e","r"}, 
            };
    }
    public void wordsABuscar(){
        words = new String[]{ 
            "patata", "ancla", "huevo",
            "switch", "ventana", "plus",
            "altavoz", "supercalifragilistico", "internet",
            "comic" 
        };
    }

    public void buscaPalabraHorizonal(){
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.println("Hay: " + horizontal(word) + " de la palabra " + word);
        }
    }
    // public void buscaPalabraVertical(){
    //     for (int i = 0; i < words.length; i++) {
    //         String word = words[i];
    //         System.out.println("Hay: " + vertical(word) + " de la palabra " + word);
    //     }
    // }
    public int horizontal(String words){
        int izq = 0;
        for (int i = 0; i < soup.length; i++) {
            for (int j = 0; j < soup[0].length - words.length(); j++) {
                String letras = "";
                for (int j2 = 0; j2 < words.length(); j2++) {
                    letras += soup[i][j+j2]; 
                }
                if(letras.equals(words)){
                    izq++;
                }
            }
        }
        return izq;
    }
    // public int vertical(String words){
    //     int vertical = 0;
    //     for (int i = 0; i < soup.length; i++) {
    //         for (int j = 0; j < soup[0].length - words.length(); j++) {
    //             String letras = "";
    //             for (int j2 = 0; j2 < words.length(); j2++) {
    //                 letras += soup[i][j+j2]; 
    //             }
    //             if(letras.equals(words)){
    //                 vertical++;
    //             }
    //         }
    //     }
    //     return vertical;
    // }
    public static void main(String[] args) {
        SopaDeLetras soup = new SopaDeLetras(); 
        soup.sopa();
        soup.wordsABuscar(); 
        soup.buscaPalabraHorizonal();
        //soup.buscaPalabraVertical();
    }
}
