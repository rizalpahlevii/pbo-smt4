class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Vehicle Name : " + name);
    }

}

class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    public void carDetail() {
        print();
    }
}

class Main {

    public static void main(String[] args) {
        Car lambo = new Car("Lamborghini");
        lambo.carDetail();

    }

}