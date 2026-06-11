import java.util.Scanner;
public class LinearSearch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int flag=0;
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==target) {
                flag = 1;
                System.out.println(i);
                break;
            }
        }
        if(flag==0){
            System.out.println("Target does not exist");
        }
    }

}
