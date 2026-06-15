import java.util.*;
public class CountCharByType{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int letters=0;
        int numbers=0;
        int symbols=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
                letters++;
            } else if(ch>='0'&&ch<='9'){
                numbers++;
            }else{
                symbols++;
            }
        }
        System.out.println(letters);
        System.out.println(numbers);
        System.out.println(symbols);
    }
}