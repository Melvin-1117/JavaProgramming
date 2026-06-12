import java.util.*;
public class VowelToSymbols{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.print("&");
            } else {
                System.out.print(ch);
            }
        }
    }
}