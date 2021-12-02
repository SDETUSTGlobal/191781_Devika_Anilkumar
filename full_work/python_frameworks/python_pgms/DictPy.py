a = {'x':100, 'y':200}
b = list(a.items())
print(b)

#Copy Dictionary
Dict = {'Tim': 18,'Charlie':12,'Tiffany':22,'Robert':25}
Boys = {'Tim': 18,'Charlie':12,'Robert':25}
Girls = {'Tiffany':22}
studentX=Boys.copy()
studentY=Girls.copy()
print (studentX)
print (studentY)
#search of item
for key in Boys.keys():
    if key in Dict.keys():
        print (True)
    else:
        print (False)

#Update Dictionary
Dict.update({"Sarah":9})
print(Dict)
#deleting from Dictionary
del Dict ['Charlie']
print (Dict)
#items Method
print ("Students Name: %s" % Dict.items())