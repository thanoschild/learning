class Laptop{

    String name;
    int price;

    // generate by IDE 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        return result;
    }

    // generate by IDE
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // generate by IDE 
    @Override
    public String toString() {
        return "Laptop [name=" + name + ", price=" + price + "]";
    }


    // @Override - must have a super class or obj type be Object to override
    // public boolean equals(Laptop obj) {
    //     if(this.name.equals(obj.name) && this.price == obj.price) return true;
    //     return false;
    // }
}

public class Oops4_hashcode {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.name = "Apple";
        obj1.price = 150;

        System.out.println(obj1);

        Laptop obj2 = new Laptop();
        obj2.name = "Apple";
        obj2.price = 150;

        System.out.println(obj1.equals(obj2));
    }
}
