class Employee:
    def __init__(self, name, id):
        self.name = name
        self.id = id
    
    def display(self):
        print("inside display fun")

e1 = Employee("haldar", 22)
    
print(e1.__dict__)
setattr(e1, 'name', "sumeet")
print(e1.__dict__)
delattr(e1, 'id')
print(e1.__dict__)
print(hasattr(e1, 'age'))
print(getattr(e1, 'name'))