import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int count[] = new int[9];
    //count 배열 초기화;
    for(int i =0; i<9; i++){
        count[i] = 0;
    }
    // arr 배열 값 입력;
    for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    for(int i = 0; i<n; i++){
    count[arr[i]-1]++;
    }
    for(int i = 0; i<9; i++){
        System.out.println(count[i]); 
    }
}
}