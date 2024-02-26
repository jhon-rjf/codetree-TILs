import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int arr[] = new int[n];//배열 초기화
    //입력받는 숫자를 전부 배열에 추가하기
    for (int i = 0; i < n; i++){
        int x = sc.nextInt();
        arr[i] = x;
    }
    //배열 속 값을 구분히여 출력하기
    for (int x = 0; x < n; x++){
        if(arr[x]%2==1 && arr[x]%3==0){
            System.out.println(arr[x]);
        }
    }
    }  
}