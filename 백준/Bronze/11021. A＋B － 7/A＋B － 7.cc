#include <stdio.h>

int main(void) {
    int a, b1, b2;
    scanf("%d", &a);
    
    for(int i = 1; i <= a; i++) {
        scanf("%d %d", &b1, &b2);
        printf("Case #%d: %d\n", i, b1+b2);
    }
    return 0;
}