import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[70]; 
        arr[0] = 1;
        arr[1] = sc.nextInt();
        for (int i = 2; i<70; i++){
            arr[i] = arr[i-1] + arr[i-2];
            if(arr[i]>=100){
                break;
            }
        }
        for (int i = 0; i<70; i++){
            System.out.print(arr[i]+" ");
            if(arr[i]>=100){
                break;
            }
        }
    }
}