class Cylinder extends Shape {
    public Cylinder(double radius, double height) {
        super(radius, height, 0);
    }
    
    // Calculate surface area of cylinder
    public double getArea() {
        return 2 * 3.14 * dim_one * (dim_one + dim_two);
    }
    
    // Cylinder does not have a perimeter
    public double getPerimeter() {
        return 0;
    }
    
    // Calculate volume of cylinder
    public double getVolume() {
        return 3.14 * dim_one * dim_one * dim_two;
    }
}
