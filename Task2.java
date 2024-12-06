package workshop2;
class Task2 {
    public double getPerimeter(double r) {
        return 4 * r;
    }

    public double getArea(double r) {
        return r*r;
    }
}
    class Circle extends Task2{
        @Override
        public double getPerimeter(double r){
            return  2*3.14*r;
        }
        @Override
        public double getArea(double r){
            return 3.14*r*r;
        }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Circle with radius 10: ");
        System.out.println("Perimeter: " + c.getPerimeter(10));
        System.out.println("Area: " + c.getArea(10));
    }
}