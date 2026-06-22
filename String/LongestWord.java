import java.util.Scanner;
public class LongestWord {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String word="";
        String longest="";
        int max=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch!=' '){
                word=word+ch;
            }else {
                if(word.length()>max){
                    max=word.length();
                    longest=word;
                }word="";
            }

        }
        if(word.length()>max){
            longest=word;
        }
        System.out.print(longest);
    }
}
