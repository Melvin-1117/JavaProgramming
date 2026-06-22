import java.util.Scanner;
public class ReverseWord {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String word="";
        String result="";
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch!=' '){
                word=word+ch;
            }else {
                result = word + " " + result;
                word = "";
            }

        }
        result=word+" "+result;
        System.out.print(result);
    }
}
