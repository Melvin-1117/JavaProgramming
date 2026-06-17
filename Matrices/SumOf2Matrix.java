import java.util.Scanner;
public class SumOf2Matrix {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int r=n;
        int c=n;
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][r];
        int arr3[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
