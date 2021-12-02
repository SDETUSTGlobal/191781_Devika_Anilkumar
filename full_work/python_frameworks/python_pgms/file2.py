def main():
    f = open("Python.txt", "r")

    if f.mode == 'r':
        contents = f.read()
    print(contents)

    f.close()
main()