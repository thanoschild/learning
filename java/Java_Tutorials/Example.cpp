#include <iostream>
using namespace std;

class A {
    public:
        void display() {
            cout<<"Showing base class"<<endl;
        }
};

class B : public A {
    public:
        void display() {
            cout<<"Showing child class"<<endl;
        }
};


int main() {
    B obj;
    obj.A::display();
    obj.display();
    return 0;
}
