n, h, a,c,q = map(int,input().split())

noticable = 0
arrayHeight = []

arrayHeight.append(h)
for i in range(1,n):
    h = (a*h+c)%q
    noticable +=len(arrayHeight)
    while arrayHeight:
        if arrayHeight[-1]<= h:
            arrayHeight.pop()
        else:
            break
    arrayHeight.append(h)
print(noticable)
