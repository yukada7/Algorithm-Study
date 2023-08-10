import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        String[] b = new String[a];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.next();
        }
        sc.close();
        
        for (String c : b) {
            System.out.println(Character.toString(c.charAt(0)) + Character.toString(c.charAt(c.length() - 1)));
        }
    }
}