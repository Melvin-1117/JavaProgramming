import java.util.*;
public class PrintStringInLine{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for(int i=0;i<input.length();i++){
            char ch= input.charAt(i);
            System.out.println(ch);
        }
    }
}