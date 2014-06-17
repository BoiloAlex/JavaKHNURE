package Vol1.Bond5;

public class Rectangle extends Point {
    double sideA, sideB;

    public Rectangle(double x, double y, double sideA, double sideB) {
        super(x,y);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle() {
        super(0,0);
        this.sideA = 5;
        this.sideB = 6;
    }

    @Override
    public void print() {
        System.out.println("rectangle (x,y): " + x + ", "+ y + " side's : " + sideA + ", " + sideB );
    }

    @Override
    void scale(double s) {
        //System.out.println("\t SCALAR = " + s + "to rectangle");
        sideB *= s;
        sideA *= s;
    }
}
