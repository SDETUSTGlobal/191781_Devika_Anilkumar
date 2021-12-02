f = 101;
e = 200;
print (f)
print (e)
def someFunction():
  global f
  print (f)
  f = "changing global variable"
someFunction()
print (f)
del e
print (e)


