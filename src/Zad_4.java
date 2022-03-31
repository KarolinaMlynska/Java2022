import java.util.Scanner;

public class Zad_4 {

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String slowo = scanner.nextLine();

        char[] c = slowo.toCharArray();

        int suma = 0;

        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                int a = Integer.parseInt(String.valueOf(c[i]));
                suma = suma + a;
            }
       }
       System.out.println("Suma cyfr w zadniu : " + suma);


    }

}

