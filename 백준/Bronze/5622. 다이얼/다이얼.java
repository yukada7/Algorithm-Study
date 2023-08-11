import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int answer = 0;
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		sc.close();

		for (int i = 0; i < a.length(); i++) {
			char b = a.charAt(i);

			switch (b) {
			case 'A': case 'B': case 'C':
				answer += 2 + 1;
				break;
			case 'D': case 'E': case 'F':
				answer += 3 + 1;
				break;
			case 'G': case 'H': case 'I':
				answer += 4 + 1;
				break;
			case 'J': case 'K': case 'L':
				answer += 5 + 1;
				break;
			case 'M': case 'N': case 'O':
				answer += 6 + 1;
				break;
			case 'P': case 'Q': case 'R': case 'S':
				answer += 7 + 1;
				break;
			case 'T': case 'U': case 'V':
				answer += 8 + 1;
				break;
			default:
				answer += 9 + 1;
				break;
			}
		}
		
		System.out.println(answer);
    }
}
