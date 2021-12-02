#Count Method on a String
#str1 = "Hello World"
#str_count1 = str1.count('o')  # counting the character “o” in the givenstring
#print("The count of 'o' is", str_count1)
#str_count2 = str1.count('o', 0,5)
#print("The count of 'o' usingstart/end is", str_count2)

#Count occurrence of a character in a given string
#str1 = "Welcome to Python "
#str_count1 = str1.count('u')  # counting the character “u” in the given string
#print("The count of 'u' is", str_count1)
#str_count2 = str1.count('u', 6,15)
#print("The count of 'u' usingstart/end is", str_count2)

#Count occurrence of substring in a given string
str1 = "Welcome to Python "
str_count1 = str1.count('to') # counting the substring “to” in the givenstring
print("The count of 'to' is", str_count1)
str_count2 = str1.count('to', 6,15)
print("The count of 'to' usingstart/end is", str_count2)