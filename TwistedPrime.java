import java.util.Scanner;
public class TwistedPrime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int temp=n;
        int count=0;
        for(int i=1;i<=temp;i++){
            if(temp%i==0){
                count++;}
            }if(count==2){
                int rev =0;
                while(n>0){
                    rev=rev*10+(n%10);
                    n=n/10;
                }
                int pos=0;
                for(int j=1;j<=rev;j++){
                    if(rev%j==0){
                        pos++;
                    }
                    
                }
                
                if(pos==2)
                    {
                        System.out.println("Twisted Prime :"+ rev);
                }
                 else{
                System.out.println("Not a prime.");
            }
            }
           
        
    }
    
}
