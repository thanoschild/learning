class Employee:
    company = 'Equinix'
    def __init__(self, name, id):
        self.name = name
        self.id = id
    
    @classmethod
    def get_company_name(cls):
        print(f"Company name is: " + cls.company)
    

e1 = Employee("haldar", 22)
print(Employee.company)
print(e1.company)
Employee.get_company_name()