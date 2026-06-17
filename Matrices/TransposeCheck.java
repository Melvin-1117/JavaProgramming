import java.util.Scanner;
public class TransposeCheck {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = n;
        int c = n;
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int arr1[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = arr[j][i];
            }
        }
        int flag = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] != arr1[i][j]) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
