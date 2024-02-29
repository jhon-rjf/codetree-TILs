import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int count = 0;

       int arr[] = new int[20];
       
        for(int i = 1; i<20; i++){
            arr[i-1] = n*i;
           
            System.out.print(arr[i-1]+" ");
             if(arr[i-1]%5==0){
                count ++;
                if(count==2){
                    break;
                }
            } 
            
        }
    }
}