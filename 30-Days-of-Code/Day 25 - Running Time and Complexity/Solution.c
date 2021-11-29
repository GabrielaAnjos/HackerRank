#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int num, n;
    scanf("%d", &num);
    
    for (int i = 0; i < num; i++) {
        scanf("%d", &n);
        
        int flag = 0;
                
        for (int j = 2; j <= sqrt(n); j++) {
            if (n % j == 0) {
                flag = 1;
                break;
            }
        }
        
        if (flag || n == 1) {
            printf("Not prime\n");
        } else {
            printf("Prime\n");      
        }   
    }
       
    return 0;
}
