import java.util.Scanner;
public class IndexOfKey {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int index =0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
           if(arr[i]==k){
            index=i;
            break;
           }
           
        } 
        System.out.println("Index of the key is "+index);
        sc.close();
    }
    
}
