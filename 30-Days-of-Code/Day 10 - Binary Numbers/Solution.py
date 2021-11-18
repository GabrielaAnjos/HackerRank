#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())
    
    binary = str(bin(n))
    
    currentMax = 0
    count = 0
    
    for i in binary:
        if i == '1':
            count += 1
        else:
            currentMax = max(count, currentMax)
            count = 0
            
    print(max(count, currentMax))
