a=int(input("enter size of array "))
arry=[]


for i in  range(0,a):
   num= int(input("enter elemnt at index {} ".format(i)))
arry.append(num)

arry=sorted(arry)

print(arry[len(arry)-2])


