#include <stdio.h>
#include <stdlib.h>

int main() {
    
    int n;
    scanf("%d", &n);
    
    int numSwaps=0;
    int arr[n];     
    
    for (int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }
    
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n - 1; j++){
            if(arr[j] > arr[j + 1]){
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
                numSwaps++;
            }
        }
        
        if (numSwaps == 0) break;
        
    }
    
    printf("Array is sorted in %d swaps.\n", numSwaps);
    printf("First Element: %d\n", arr[0]);
    printf("Last Element: %d\n", arr[n-1]);
    
    return 0;
    
}