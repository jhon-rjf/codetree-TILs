import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        while (true){
            int row = sc.nextInt();
            int column = sc.nextInt();
            String ex = sc.next();    
            int rc = row*column;
                System.out.println(rc);
                if (ex.equals("C")){
                break;
            }
            }

        }

    }