// Abstract class Shape
abstract class Shape {
    protected double dim_one, dim_two, dim_three;
    
    // Default constructor
    public Shape() {
        dim_one = dim_two = dim_three = 0.0;
    }
    
    // Parameterized constructor
    public Shape(double dim_one, double dim_two, double dim_three) {
        this.dim_one = dim_one;
        this.dim_two = dim_two;
        this.dim_three = dim_three;
    }
    
    // Abstract methods for area, perimeter, and volume
    abstract double getArea();
    abstract double getPerimeter();
    abstract double getVolume();
}