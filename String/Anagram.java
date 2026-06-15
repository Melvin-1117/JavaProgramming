import java.util.*;
public class Anagram {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1.length()!=str2.length()){
            System.out.print("Not anagram");
        }else {
            int count = 0;
            for (int i = 0; i < str1.length(); i++) {
                char ch1 = str1.charAt(i);
                for (int j = 0; j < str2.length(); j++) {
                    if (ch1 == str2.charAt(j)) {
                        count++;
                    }
                }
            }
            if (count == str1.length()) {
                System.out.print("Anagram");
            } else{
                System.out.print("Not a anagram");
            }
        }
    }
}
