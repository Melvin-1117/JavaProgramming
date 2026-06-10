import java.util.Scanner;
public class Frequency {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element:"+" ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            int count1=0;
            for(int j=i+1;j<n;j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count==0) {
                for (int k = 0; k < i + 1; k++) {
                    if (arr[k] == arr[i]) {
                        count1++;
                    }
                }
                System.out.println(arr[i]+"-"+count1);
            }
        }
    }
}
