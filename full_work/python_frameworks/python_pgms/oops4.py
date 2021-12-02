class user():
 na=" "
 def per(self):
     print(self.na)
 def __init__(self,na):
     self.na=na

class childClass(user):
    def method(self):
        print(self.na+"world")


def main():
    # exercise the class methods
    c2 = childClass("Hello")
    c2.per()
    c2.method()


if __name__ == "__main__":
    main()

