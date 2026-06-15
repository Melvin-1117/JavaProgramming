import java.util.*;
public class StarAndHash {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count=0;
        int count1=0;
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch=='#'){
                count++;
            }else{
                count1++;
            }
        }
        System.out.print(count1-count);
    }
}
