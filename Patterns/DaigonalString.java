import java.util.*;
public class DaigonalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            for (int j=0;j<n;j++) {
                if (i == j ) {
                    System.out.print(ch+ " ");

                } else if(i + j == n-1){
                    System.out.print(str.charAt(n-i-1)+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
/*
sivan
s       n
  i   a
    v
  i   a
s       n
 */