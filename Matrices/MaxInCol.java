import java.util.Scanner;
public class MaxIncol {
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
        for (int i = 0; i < c; i++) {
            int max=arr[0][i];
            for (int j = 0; j < r; j++) {
                if (arr[j][i] > max) {
                    max = arr[j][i];
                }
            }
            System.out.print(max+" ");
        }
    }
}
