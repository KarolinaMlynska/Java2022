package pliki;
import java.io.FileNotFoundException;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class zliczanie_znaków {
    public static void main(String[] args) throws FileNotFoundException {

        int[] znaki = new int[3];
        int białe_znaki = 0;
        int i = 0;
        int slowo = 0;

        String content = null;
        Scanner scanner = new Scanner(new File("plik.txt"), String.valueOf(StandardCharsets.UTF_8));
        content = scanner.useDelimiter("\\A").next();
        System.out.println("Zawartość pliku:");
        System.out.println(content);

        do {
            char n = content.charAt(i);
            if (n == ' ' || n == '\t' || n == '\n') {
                białe_znaki++;
            }
            i++;
        } while (i < content.length());

        String[] slowa = content.split("\\s+");

        for (int j = 0; j < slowa.length; j++) {
            if (!slowa[j].matches(".*[0-9].*")) {
                slowo++;
            }
        }

        znaki[0] = (content.length() - 1);
        znaki[1] = (białe_znaki -1);
        znaki[2] = slowo;

        System.out.println("\nIlość znaków w pliku wynosi: " + znaki[0]);
        System.out.println("\nIlość białych znaków w pliku wynosi: " + znaki[1]);
        System.out.println("\nIlość słów w pliku wynosi: " + znaki[2]);

        for(int g = 0; g < znaki.length; g++){
            System.out.print(znaki[g]);
            System.out.print(' ');
        }


    }
}
