import java.util.Scanner;
public class MinInRow {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=n;
        int c=n;
        int arr[][]=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            int min=arr[i][0];
            for (int j = 0; j < c; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            System.out.print(min+" ");
        }
    }
}
