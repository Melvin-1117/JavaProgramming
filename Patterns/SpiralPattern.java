import java.util.*;
public class SpiralPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int top = 0;
        int right = n - 1;
        int bottom = n - 1;
        int left = 0;
        while(top<=bottom&&left<=right){
        for (int i = top; i <= right; i++) {
            System.out.print(arr[top][i] + " ");
        }
        top++;
        for(int j=top;j<=bottom;j++){
            System.out.print(arr[j][bottom]+" ");
        }right--;
        if(top<=bottom){
            for(int i=right;i>=left;i--){
                System.out.print(arr[bottom][i]+" ");
            }bottom--;
        }
        if(left<=right) {
            for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++;
        }
        }
    }
}

