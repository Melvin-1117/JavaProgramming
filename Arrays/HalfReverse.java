import java.util.Scanner;
public class HalfReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mid;
        if(n%2==0){
            mid=n/2-1;
        }else{
            mid=(n/2);
        }
        int start=0,end=mid;
        while(start<end) {
            if (start < end) {
                int temp= arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
