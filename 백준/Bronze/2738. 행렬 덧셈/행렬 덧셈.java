import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int i = sc.nextInt();
        int j = sc.nextInt();
        int[][] a = new int[i][j];
        int[][] b = new int[i][j];
    
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                a[k][l] = sc.nextInt();
            }
        }
    
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                b[k][l] = sc.nextInt();
            }
        }
    
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.print(a[k][l] + b[k][l] + " ");
                
                if (l == j - 1) System.out.println();
            }
        }
    }
    
}