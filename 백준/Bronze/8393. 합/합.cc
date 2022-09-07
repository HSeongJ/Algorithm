#include <stdio.h>

int main(void) {
    int a, sum=0;
    
    scanf("%d\n", &a);
    
    for(int i =1; i<=a; i++) {
        sum += i;
    }
    printf("%d\n", sum);
    return 0;
}