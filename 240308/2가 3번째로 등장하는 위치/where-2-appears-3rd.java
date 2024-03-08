import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int locate = 0;
       int count = 0;

       int arr[] = new int[n];
       for (int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
        if(arr[i] == 2){
            count++;
        }
        if(count>=3){
            locate = i+1;
            break;
        }
       }
    System.out.print(locate);
    }
}