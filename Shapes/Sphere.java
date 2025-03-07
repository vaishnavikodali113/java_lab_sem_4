class Sphere extends Shape {
    public Sphere(double radius) {
        super(radius, 0, 0);
    }
    
    public double getArea() {
        return 4 * 3.14 * dim_one * dim_one;
    }
    
    public double getPerimeter() {
        return 0;
    }
    
    public double getVolume() {
        return (4.0 / 3.0) * 3.14 * dim_one * dim_one * dim_one;
    }
}