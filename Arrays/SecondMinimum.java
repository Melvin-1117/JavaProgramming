import java.util.Scanner;
public class SecondMinimum {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                arr[i]=min;
            }
        }
        int smin=arr[3];
        for(int i=1;i<n;i++){
            if(arr[i]<smin && arr[i]!=min){
                smin=arr[i];
            }
        }
        System.out.print(smin);
    }
}
