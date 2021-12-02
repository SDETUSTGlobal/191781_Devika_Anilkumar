def main():
    f = open("Python.txt", "w+")

    for i in range(10):
        f.write("This is line %d\r\n" % (i + 1))

    f = open("Python.txt", "a+")

    for i in range(2):
        f.write("Appended line %d\r\n" % (i + 1))
    f.close()
main()