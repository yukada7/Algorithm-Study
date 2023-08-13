import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		String a = sc.next();
		StringBuilder sb = new StringBuilder();
		sc.close();
		
		for (int i = a.length() - 1; i >= 0; i--) {
			sb.append(a.charAt(i));
		}
		
		String b = sb.toString();
		
		if (a.equals(b)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
    }
}