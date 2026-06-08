import java.util.Scanner;
public class AmstrongNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int temp = n ;
        int temp1=n;
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        temp=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            int result=1;
            for(int i=1;i<=count;i++){
                result=result*digit;
            }
            n=n/10;
            sum=sum+result;
        }
        if(sum==temp1){
            System.out.println("Amstrong Number");
        }else{
            System.out.println("Not a amstrong number");
        }
        sc.close();
    }

    
}
