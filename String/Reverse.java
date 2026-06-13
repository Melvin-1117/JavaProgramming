import java.util.*;
public class Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for(int i= input.length()-1;i>=0;i--){
            char ch = input.charAt(i);
            System.out.print(ch);
        }
    }
}