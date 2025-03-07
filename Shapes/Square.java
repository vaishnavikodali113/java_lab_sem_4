// Square Class
class Square extends Shape {
    public Square(double length) {
        super(length, 0, 0);
    }
    
    // Calculate area of square
    public double getArea() {
        return dim_one * dim_one;
    }
    
    // Calculate perimeter of square
    public double getPerimeter() {
        return 4 * dim_one;
    }
    
    // Square does not have volume
    public double getVolume() {
        return 0;
    }
}
