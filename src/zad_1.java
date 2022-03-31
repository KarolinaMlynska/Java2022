import java.util.Scanner;
public class zad_1 {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int ilosc_liter=0;
        String slowo = scanner.nextLine();
        char ostatnia_litera =slowo.charAt(slowo.length()-1);
        for(int i=0;i<slowo.length();i++) {

            if (slowo.charAt(i) == ostatnia_litera)
            {
                ilosc_liter++;
            }
        }
        System.out.println("Twoje slowo: " + slowo);
        System.out.println("Oststni znak wyświetla się " + ilosc_liter  + " razy");
    }
}

