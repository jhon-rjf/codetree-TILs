import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        int count = 0;
        for (int i = 0; i<100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == -999 || arr[i] == 999){
                break;
            }
            count++;
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<count; i++){
            if(min>arr[i]){
                min = arr[i];
            }
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.print(max+" "+min);
        

    }
}