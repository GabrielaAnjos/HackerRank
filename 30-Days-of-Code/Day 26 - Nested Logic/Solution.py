# Enter your code here. Read input from STDIN. Print output to STDOUT

iDay, iMonth, iYear = [int(x) for x in input().split(' ')]
fDay, fMonth, fYear = [int(x) for x in input().split(' ')]

fine = 0

if iYear > fYear:
    fine = 10000;
elif iYear == fYear:
    if iMonth > fMonth:
        fine = (iMonth - fMonth) * 500
    elif iMonth == fMonth and iDay > fDay:
        fine = (iDay - fDay) * 15
        
print(fine)