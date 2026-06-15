import java.util.*;
public class Panagram {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        int count=0;
        for(char ch='a';ch<='z';ch++) {
            for (int i = 0; i < input.length(); i++) {
                char ch1 = input.charAt(i);
                if (ch1 >= 'A' && ch1 <= 'Z') {
                    ch1 = (char) (ch1 + 32);
                }
                if (ch == ch1) {
                    count++;
                    break;
                }
            }
        }
            if (count == 26) {
                System.out.print("Panagaram");
            } else {
                System.out.print("Not Panagaram");
            }
    }
}
