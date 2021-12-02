import os.path
from os import path
def main():

   print ("File exists:"+str(path.exists('Python.txt')))
   print ("File exists:" + str(path.exists('career.Python.txt')))
   print ("directory exists:" + str(path.exists('myDirectory')))
   print("Is it File?" + str(path.isfile('Python.txt')))
   print("Is it File?" + str(path.isfile('myDirectory')))
if __name__== "__main__":
   main()