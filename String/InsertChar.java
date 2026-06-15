import java.util.*;
public class InsertChar {
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        String input=sc.nextLine();
        String insert=sc.nextLine();
        int k=sc.nextInt();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(i==k){
                System.out.print(insert);
            }
            System.out.print(ch);
        }
        if(k>input.length()){
            System.out.print(insert);
        }
    }
}
