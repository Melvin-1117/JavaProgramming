import java.util.*;
public class Palindrome{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        String input = sc.nextLine();
        int start =0;
        int end= input.length()-1;
        boolean palindrome = true;
        while(start<end){
            if(input.charAt(start)!=input.charAt(end)){
                palindrome=false;
                break;
            }
            start++;
            end--;
        }
        if(palindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        }

}