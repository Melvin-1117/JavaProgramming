import java.util.*;
public class BoundaryElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row = n;
        int col = n;
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int j=0;j<row;j++){
            System.out.print(arr[0][j]+" ");
        }for(int i=1;i<row-1;i++){
            System.out.print(arr[i][n-1]+" ");
        }for(int j=col-1;j>0;j--){
            System.out.print(arr[n-1][j]+" ");
        }for(int i=row-1;i>=1;i--){
            System.out.print(arr[i][0]+" ");
        }
    }
}
