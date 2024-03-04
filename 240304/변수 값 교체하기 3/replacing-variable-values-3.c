#include <stdio.h>

int main() {
    int a = 3;
    int b = 5;
    int temp = 0;
    a = temp;
    a = b;
    b = temp;
    printf("%d\n%d",a,b);
    return 0;
}