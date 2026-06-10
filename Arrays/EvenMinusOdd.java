import java.util.Scanner;
public class EvenMinusOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int  arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int evensum=0;
        int oddsum= 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evensum=evensum+arr[i];
            }
            else{
                oddsum=oddsum+arr[i];
            }
        }
        int diff;
        if(evensum>oddsum){
            diff = evensum-oddsum;
        }
        else{
            diff= oddsum-evensum;
        }
        System.out.println(diff);


    }
}
