#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    
    int iDay, iMonth, iYear, fDay, fMonth, fYear;
    int fine = 0;
    
    scanf("%d %d %d %d %d %d", &iDay, &iMonth, &iYear, &fDay, &fMonth, &fYear);
    
    if (iYear == fYear) {
        if (iMonth == fMonth) {
            fine = (iDay - fDay) * 15;
        } else {
            fine = (iMonth - fMonth) * 500;
        }
    } else if (iYear > fYear) {
        fine = 10000;        
    }
    
    if (fine < 0) fine = 0;
    
    printf("%d", fine);
     
    return 0;
}
