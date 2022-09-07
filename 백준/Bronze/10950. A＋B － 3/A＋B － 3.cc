#include <stdio.h>

int main(void) {
    int a, b, re;
    scanf("%d", &re);
    
    for(int i = 0; i < re; i++) {
        scanf("%d %d", &a, &b);
        printf("%d\n", a+b);
    }
    return 0;
}