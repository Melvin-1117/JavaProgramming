import java.util.*;
public class Panagram {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        int arr[] = new int[256];
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch>='A'&&ch<='Z'){
                ch=(char)(ch+32);
            }
            arr[ch]++;
        }
        int flag=0;
        for(int i='a';i<='z';i++){
            if(arr[i]==0){
                flag=1;
                break;
            }
        }
        if (flag == 0) {
            System.out.print("Pangram");
        }else{
            System.out.print("Not pangram");
        }
    }
}
