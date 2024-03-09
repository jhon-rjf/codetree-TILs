import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int arr[] = new int[10];
        for(int i = 0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<10; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
    System.out.print(max);
}
}