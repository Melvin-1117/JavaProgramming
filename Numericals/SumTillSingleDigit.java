import java.util.Scanner;
public class SumTillSingleDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int num=0;
        while(temp>0){
            int digit=temp%10;
            int sum =0;
            for(int i=0;i<=digit;i++){
                sum=sum+digit;
                System.out.println(sum);
            }
            temp=temp/10;
            num=sum;
        }
        System.out.println(num);
        sc.close();
    }
}
