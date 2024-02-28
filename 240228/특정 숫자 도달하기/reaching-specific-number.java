import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double avg = 0.0;
        int sum = 0;
        double count = 0.0;
        int arr[] = new int[10];
        for(int i = 0; i<10; i++){
            arr[i] = sc.nextInt();
              sum += arr[i];
              count ++;
            if(arr[i]>=250){
                sum -= arr[i];
                count --;
                break;
            }
        }
        
        System.out.print(sum+" ");
        avg = sum/count;
        System.out.printf("%.1f", avg);
    }
}