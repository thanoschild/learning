class A:
    def display(self):
        print("Showing base class")

class B(A):
    def display(self):
        print("Showing child class")
        super().display()

if __name__ == "__main__":
    obj = B()
    obj.display()
    
