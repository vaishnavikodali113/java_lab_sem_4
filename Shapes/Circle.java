class Circle extends Shape {
    public Circle(double radius) {
        super(radius, 0, 0);
    }
    
    // Calculate area of circle
    public double getArea() {
        return 3.14 * dim_one * dim_one;
    }
    
    // Calculate perimeter (circumference) of circle
    public double getPerimeter() {
        return 2 * 3.14 * dim_one;
    }
    
    // Circle does not have volume
    public double getVolume() {
        return 0;
    }
}