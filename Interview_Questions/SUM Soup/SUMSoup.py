'''
    *author: Keivalya
    *date: 25/09/2020 DDMMYYY

    Problem: SUM Soup
    Issue #6
'''

# Declaring function
def SUM(a, b):
    result = 0
    i = 0
    while i < a:
        
        for i in range(a):
            result = result + sum(range(b+1))
            b = result - 1
        i = i+1
    return result

# Main
T = int(input())
for i in range(T):
    nums = input()
    arr = nums.split()
    D = int(arr[0])
    N = int(arr[1])
    print(SUM(D, N))