def func1():
    print("I am learning Python function")
    print("still in func1")


func1()


def square(x):
    return x * x


print(square(4))


def multiply(x, y=0):
    print("value of x=", x)
    print("value of y=", y)

    return x * y


print(multiply(y=2, x=4))

adder = lambda x, y: x + y
print (adder (1, 2))

#example 2
#What a lambda returns
string='some kind of a useless lambda'
print(lambda string : print(string))

#What a lambda returns #2
x="some kind of a useless lambda"
(lambda x : print(x))(x)



def pyth( funct, *args ):
 funct( *args )
def printer_one( arg ):
 return print (arg)
def printer_two( arg ):
 print(arg)
#CALL A REGULAR FUNCTION
pyth( printer_one, 'printer 1 REGULAR CALL' )
pyth( printer_two, 'printer 2 REGULAR CALL \n' )
#CALL A REGULAR FUNCTION THRU A LAMBDA
pyth(lambda: printer_one('printer 1 LAMBDA CALL'))
pyth(lambda: printer_two('printer 2 LAMBDA CALL'))

#Using lambdas with Python built-ins
#IIFE in Python Lambda :IIFE stands for immediately invoked function execution
(lambda x: x + x)(2)

#lambdas in filter()
sequences = [10,2,8,7,5,4,3,11,0, 1]
filtered_result = filter (lambda x: x > 4, sequences)
print(list(filtered_result))

#lambdas in map()
sequences = [10,2,8,7,5,4,3,11,0, 1]
filtered_result = map (lambda x: x*x, sequences)
print(list(filtered_result))

#lambdas in reduce()
from functools import reduce
sequences = [1,2,3,4,5]
product = reduce (lambda x, y: x*y, sequences)
print(product)
