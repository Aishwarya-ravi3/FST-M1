
print("Hello, World!")

age = 36
mark = 33
txt = "My name is {} John, and I am {}"
print(txt.format(age,mark))
# Output: My name is John, and I am 36

number = int(input("Enter number:"))

mod = number % 2

'''
if mod>0:
 print("Number is odd")
else:
  print("Number is even")

'''
fruits = ["Apple","Banana","Cherry"]

for fruit in fruits:
    if fruit =="Banana":
        continue
    print (fruit)   
