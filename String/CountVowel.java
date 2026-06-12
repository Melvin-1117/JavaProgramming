import java.util.*;
public class CountVowel{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        int vowel=0;
        int consonant=0;
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if((ch>='A'&&ch>='Z')||(ch=='a'&&ch=='z')){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowel++;
                }else{
                    consonant++;
                }
            }
        }
        System.out.println("vowels "+vowel);
        System.out.println("Consonants "+consonant);
    }
}