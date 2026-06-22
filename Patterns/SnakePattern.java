import java.util.Scanner;
public class SnakePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int num=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    arr[i][j]=num++;
                }
            }else{
                for(int k=n-1;k>=0;k--){
                    arr[i][k]=num++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }System.out.println("");
        }
    }
}
/*

4
1 2 3 4
8 7 6 5
9 10 11 12
16 15 14 13

 */