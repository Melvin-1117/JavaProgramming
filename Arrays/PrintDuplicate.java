import java.util.Scanner;
public class PrintDuplicate {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
            for(int i=0;i<n;i++){
                int flag=0;
                for(int j=0;j<n;j++) {
                    if (arr[i]==arr[j]) {
                        flag = 1;
                        break;
                    }
                }
                if(flag==1){
                    for(int k=i+1;k<n;k++){
                        if(arr[i]==arr[k]){
                            System.out.print(arr[i]+" ");
                        }
                    }
                }

        }
    }
}
