#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int n;
    int count=0;
    
    scanf("%d", &n);
    
    while (n != 0) {
        n = n & (n<<1);
        count++;
    }
    printf("%d", count);

    return 0;
}
