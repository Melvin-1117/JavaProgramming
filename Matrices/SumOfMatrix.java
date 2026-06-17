import java.util.Scanner;
public class SumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r = n;
        int c = n;
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            sum = sum+arr[i][j];
        }
    }
        System.out.print(sum);
     }
    }
