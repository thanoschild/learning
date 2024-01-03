#include <stdio.h>

// Define the base class A
struct A {
    void (*display)(struct A*);  // Function pointer for the display method
};

// Define the display method for class A
void display_A(struct A* self) {
    printf("Showing base class\n");
}

// Define the derived class B
struct B {
    struct A base;  // Embed the base class A in class B
};

// Define the display method for class B
void display_B(struct B* self) {
    printf("Showing child class\n");
}

int main() {
    // Create an object of class B
    struct B obj;

    // Set the display method of class A for the object
    obj.base.display = &display_A;

    // Call the display method of class B
    display_B(&obj);

    // Call the display method of class A using the object of class B
    obj.base.display(&obj.base);

    return 0;
}
