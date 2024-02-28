import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int i = 0;
        int sum = 0;
        for(;  i<10; i++){
            arr[i]=sc.nextInt();   
            sum += arr[i];
            if(arr[i]==0){
                sum -= arr[i];
                break;
            }   
        }
        
        double avg = sum/i;
        System.out.print(sum+" ");
        System.out.printf("%.1f", avg);
        
    }
}