import java.util.Scanner;
public class StrongNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        String strong=(n==sum)?"Strong":"Not a strong";
        System.out.println(strong);
        sc.close();
    
    }
}
