import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int c_room_cnt = 0; 
        int hall_cnt = 0;
        int toilet_cnt = 0;

        for(int i = 0; i<=date; i++){
            if(i%2==0 && i%3!=0 && i%12!=0 && date>1){
                c_room_cnt++;
            }else if(i%3==0 && i%12!=0 && date>3 && i>=1){
                hall_cnt++;
            }else if(i%12==0 && date>12 && i>=1 ){
                toilet_cnt++;
            }
        }
        System.out.print(c_room_cnt+" ");
        System.out.print(hall_cnt+" ");
        System.out.print(toilet_cnt);
    }
}