import java.util.Scanner;
public class Compare2Matrix {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = n;
        int c = n;
        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][r];
        int flag = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}
