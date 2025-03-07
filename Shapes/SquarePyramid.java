// Square Pyramid (Equilateral Base)
class SquarePyramid extends Shape {
    public SquarePyramid(double baseSide, double height) {
        super(baseSide, height, 0);
    }
    
    // Calculate surface area of square pyramid
    public double getArea() {
        double slantHeight = Math.sqrt((dim_one / 2) * (dim_one / 2) + dim_two * dim_two);
        return dim_one * dim_one + 2 * dim_one * slantHeight;
    }
    
    // Calculate perimeter of square base
    public double getPerimeter() {
        return 4 * dim_one;
    }
    
    // Calculate volume of square pyramid
    public double getVolume() {
        return (1.0 / 3.0) * dim_one * dim_one * dim_two;
    }
}
