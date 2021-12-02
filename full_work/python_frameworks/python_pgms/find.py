#Example of find() method with default values
#mystring = "Best site for Python "
#print("The position of programs is at:", mystring.find("programs"))
#------------------------------------------------------------------------------------------------------
#Example of find() using start argument
#mystring = "Best site for Python "
#print("The position of programs is at:", mystring.find("programs", 20))
#-----------------------------------------------------------------------------------------------------------
#Example of find() using start and end arguments
#mystring = "Best site for Python programs!"
#print("The position of programs is at:", mystring.find("programs", 5, 30))
#----------------------------------------------------------------------------------------------------------
#Example of find() method To find the position of a given substring in a string
#mystring = "Best site for Python"
#print("The position of Best site is at:", mystring.find("Best site", 5, 40))
#print("The position of Python is at:", mystring.find("Python", 20))
#------------------------------------------------------------------------------------------------------------
#Python string rfind()
#The Python function rfind() is similar to find() function with the only difference is that rfind() gives the highest index for the substring given and find() gives the lowest i.e the very first index.
#Both rfind() and find() will return -1 if the substring is not present.
#mystring = "Best site for Python "
#print("The position of programs using find() : ", mystring.find("programs"))
#print("The position of programs using rfind() : ", mystring.rfind("programs"))
#---------------------------------------------------------------------------------------------------------------
#Python string index()
#The Python string index() is function that will give you the position of the substring given just like find().
#The only difference between the two is, index() will throw an exception if the substring is not present in the string and find() will return -1.
mystring = "Best site for Python "
print("The position of programs using find() : ", mystring.find("programs"))
print("The position of programs using index() : ", mystring.index("programs"))
#------------------------------------------------------------------------------------------------------------------
#To find the total occurrence of a substring
#my_string = "test string test, test string testing, test string test string"
#startIndex = 0
#count = 0
#for i in range(len(my_string)):
 #   k = my_string.find('test', startIndex)
   # if(k != -1):
    #    startIndex = k+1
     #   count += 1
      #  k = 0
#print("The total count of substring test is: ", count )