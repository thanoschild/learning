class Employee:

    '''This class is created to maintain employee data'''

    def __init__(self, name, id):
        self.name = name
        self.id = id
    
    def display(self):
        print("inside display fun")

e1 = Employee("haldar", 22)
print(Employee.__doc__)
print(Employee.__dict__)
print(Employee.__name__)
print(Employee.__module__)