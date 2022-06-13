package m03.uf05.examenPrueba;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ShakeSpeare {
    
    public void shakespeare() {

        String[] hamlet = {"That", "can", "I",
            "At", "least", "the", "whisper",
            "goes", "so", "Our", "last", "king",
            "Whose", "image", "even", "but", "now",
            "appear", "d", "to", "us",
            "Was", "as", "you", "know", "by",
            "Fortinbras", "of", "Norway",
            "Thereto", "prick", "d", "on", "by",
            "a", "most", "emulate", "pride", "Whisper",
            "hola", "mon", "arbre", "holamon"
        };

        List<String> list = Arrays.asList(hamlet);
        TreeSet<String> s = new TreeSet<>(list);
        
        for (String str : s) {
            str = str.toLowerCase();
            if (str.length() > 5) {
                System.out.print(str + " ");
            }
        }
    }

    public static void main(String[] args) {
        ShakeSpeare sh = new ShakeSpeare();

        sh.shakespeare();
    }


}
