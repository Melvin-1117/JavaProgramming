import java.util.Scanner;
public class AbosulteDiffInDaigonal {
    public static void main(String[] args) {
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
        int sum=0;
        for(int i=0;i<n;i++){
                    sum=sum+arr[i][i];
                }
        int sum1=0;
        int index=n-1;
        for(int i=0;i<n;i++){
            sum1=sum1+arr[i][index];
            index--;
        }
        if(sum>sum1){
            System.out.print(sum-sum1);
        }else{
            System.out.print(sum1-sum);
        }
    }
}
