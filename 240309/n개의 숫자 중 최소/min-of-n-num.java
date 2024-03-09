import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int arr[] = new int[N];
        for(int i = 0; i<N ;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 0; i<N; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }    
        for(int i = 0; i<N; i++){
            if(arr[i]==min){
                count++;
            }
        }   
    System.out.print(min+" "+count);
    }
}