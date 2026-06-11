import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int first=0;
        int last=n-1;
        int flag =0;
        while(first<last){
            if(arr[first]!=arr[last]){
                flag=1;
            }
            first++;
            last--;
        }
        if(flag==1){
            System.out.println("Not a palindrome");
        } else {
            System.out.println("Palindrome");
        }

    }
}
