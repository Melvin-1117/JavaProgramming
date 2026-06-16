import java.util.*;
public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=0;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
        int seclar=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>seclar && arr[i]!=largest){
                seclar=arr[i];
            }
        }
        System.out.println(seclar);
    }
    
}
