import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int std[] = new int[100];

    int count[] = new int[10];
    int ten[] = new int[100];
    //count 배열 초기화
    for(int i = 0; i<10; i++){
        count[i] = 0;
    }
    //학생 점수 입력받기.
    for(int i=0; i<100; i++){
        int temp = sc.nextInt();
        if(temp==0){
            break;
        }else if(temp<10){
            continue;
        }else {
            ten[i] = temp/10;
        }
        std[ten[i]-1]++;
    }
    for (int i=9; i>=0; i--){
        System.out.println((i+1)*10+" - "+std[i]);     
    }
    
    }
}