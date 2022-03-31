+import java.util.Scanner;
+
+public class Zad_3 {
+
+    static public void main(String[] args){
+        Scanner scanner = new Scanner(System.in);
+        String slowo = scanner.nextLine();
+
+        StringBuilder sb = new StringBuilder();
+
+        sb.append(slowo);
+        sb.reverse();
+
+        if(slowo.contentEquals(sb) == true){
+            System.out.println("Twoje sĹ‚owo to palindrom.");
+        }
+        else{
+            System.out.println("Twoje sĹ‚owo nie jest palindromem.");
+        }
+    }
+
+}
