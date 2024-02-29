import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       int square[] = new int[n];
       for(int i = 0; i<n; i++){
        arr[i]= sc.nextInt();
        square[i] = arr[i]*arr[i];
        System.out.print(square[i]+" ");
       }
    }
}