#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
      
      char s[1024];
      scanf("%s", s);
      
      int count;
      char compare[] = {'0','1','2','3','4','5','6','7','8','9'}; // not a char
      
      for (int i = 0; i < 10; i++){
        count = 0;
        
        for (int j = 0; j < strlen(s); j++){
            if (s[j] == compare[i]) count++;
        }
          
        printf("%d ", count);
      }
      
    return 0;
}
