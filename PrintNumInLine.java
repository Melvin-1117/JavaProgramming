import java.util.Scanner;
public class PrintNumInLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int rev=0;
        int count=0;
        while(num>0){
            rev=rev*10+(num%10);
            num=num/10;
            count++;
        }
        int digit=0;
        while(rev>0){
            digit=rev%10;
            rev=rev/10;
            System.out.println(digit+" ");
            }
        scanner.close();
    }
}