// Prototype pattern
abstract class Prototype implements Cloneable {
    public Prototype clone() throws CloneNotSupportedException{
        return (Prototype) super.clone();
    }
}
	
class ConcretePrototype1 extends Prototype {
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype1)super.clone();
    }
}

class ConcretePrototype2 extends Prototype {
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype2)super.clone();
    }
}

public class PrototypePattern {

    public static void main (String [] args) throws CloneNotSupportedException {
       Prototype car1 = new ConcretePrototype1();
       Prototype car2 = new ConcretePrototype2();
       
       Prototype anotherCar1 = car1.clone();
       Prototype anotherCar2 = car2.clone();
    }
}