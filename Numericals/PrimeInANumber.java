import java.util.Scanner;
public class PrimeInANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("The number you entered is: " + num);
        while(num>0){
            int digit = num%10;
            int count=0;
            for(int j=1;j<=digit;j++){
            if(digit%j==0){
                count++;
            } 
        }
        if(count==2){
            System.out.print(digit);
            }
        scanner.close();
        num=num/10;
    }
}
}