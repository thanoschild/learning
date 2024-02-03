class Student:
    def __init__(self, name, id):
        self.name = name
        self.id = id

    # instance method
    def display(self):
        print(self.name, self.id)

    def change_data(self):
        self.name = input("Enter new name: ")
        self.id = int(input("Enter new Id: "))

s1 = Student("sumeet", 3300)
print(s1.__dict__)
# instanve variable 
s1.age = 21
print(s1.__dict__)

# can delete instance variable
del s1.age
print(s1.__dict__)

s1.display()
s1.change_data()
s1.display()