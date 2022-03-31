import java.util.Scanner;
public class zad_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String slowo = scanner.nextLine();

        StringBuilder sb = new StringBuilder(slowo);


        System.out.println("Twoje slowo: " + slowo);
        System.out.println("Odwrócone slowo: " + sb );


    }
}
