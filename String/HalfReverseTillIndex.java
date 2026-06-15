import java.util.*;
public class HalfReverseTillIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int index = sc.nextInt();
        for (int i = index; i >= 0; i--) {
            char ch = input.charAt(i);
            System.out.print(ch);
        }
        for (int i=index; i <input.length(); i++) {
            System.out.print(input.charAt(i));
        }
    }
}
