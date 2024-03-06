// #include <stdio.h>

// int main(){
//     int a = 0;
//     int b = 0;
//     scanf("%d, %d", &a,&b);
//     printf("%d\n",a+b);
//     printf("%d\n",a-b);
//     printf("%d\n",a/b);
//     printf("%d",a%b);
//     return 0;
// }
#include <stdio.h>

int main() {
    // 변수 선언 및 입력
    int a, b;
    scanf("%d %d", &a, &b);
    
    printf("%d\n", a + b);
    printf("%d\n", a - b);
    printf("%d\n", a / b);
    printf("%d\n", a % b);
    return 0;
}