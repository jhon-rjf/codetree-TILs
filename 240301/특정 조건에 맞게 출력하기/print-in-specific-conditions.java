import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int arr[] = new int[70];
    for(int i = 0; i<30; i++){
        int temp = sc.nextInt();
        if(temp == 0){
            break;
        }
        if(temp%2==0){
            arr[i] = temp/2;
        }else{
            arr[i] = temp + 3;
        }
        System.out.print(arr[i]+" ");
        
    }
    }
}