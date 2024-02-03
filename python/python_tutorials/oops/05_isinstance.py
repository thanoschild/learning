class Demo:
    pass

class Employee:

    def __init__(self, name, id):
        self.name = name
        self.id = id
    
    def display(self):
        print("inside display fun")

e1 = Employee("haldar", 22)
d1 = Demo()
flag = isinstance(e1, Demo)
print(flag)