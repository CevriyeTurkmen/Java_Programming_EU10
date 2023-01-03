package day45_Abstraction_Interface.shape;

public class Cube extends Shape implements Volume {

    private double side;

    public Cube(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double area() {
        return 6*side*side;
    }
    @Override
    public double perimeter() {
        return 12*side;

    }

    public String toString() {
        return "Cube{" + super.toString()+
                "side=" + side +
                '}';
    }


    @Override
    public double volume() {
        return 0;
    }
}
