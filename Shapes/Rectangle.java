// Rectangle Class
class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width, 0);
    }
    
    // Calculate area of rectangle
    public double getArea() {
        return dim_one * dim_two;
    }
    
    // Calculate perimeter of rectangle
    public double getPerimeter() {
        return 2 * (dim_one + dim_two);
    }
    
    // Rectangle does not have volume
    public double getVolume() {
        return 0;
    }
}