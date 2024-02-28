import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        for (int i = 0; i<n; i++){
            int filter = sc.nextInt();
            if(filter%2==0){
                arr[count] = filter;
                count++;
            }
        }
        for (int i = count-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}