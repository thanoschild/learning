class Employee:

    # default constructor
    def __init__(self):
        self.name = 'sumeet'
        self.id = 21
    
    #  python doesn't support method overloading
    #* When you define a method with the name __init__ in a Python class, it serves as
    #* the constructor, responsible for initializing the object's state when it's instantiated. 
    #* If you attempt to define another __init__ method in the same class, it will overwrite 
    #* the previous one, leading to only the last definition being used.
    def __init__(self, name, id):
        self.name = name
        self.id = id
    
    def display(self):
        print("inside display fun")

e1 = Employee("haldar", 22)
    
print(e1.__dict__)
e1.display()
print(e1.id)
e1.id = 44
print(e1.id)
