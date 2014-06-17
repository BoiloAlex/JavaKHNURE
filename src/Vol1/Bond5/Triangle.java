package Vol1.Bond5;

public class Triangle extends Point{
    double base, hight;


    public Triangle(double x, double y , double base, double hight){
        super(x,y);
        this.base = base;
        this.hight = hight;
    }

    @Override
    public void print() {
        System.out.println("rectangle (x,y): " + x + ", "+ y + " side's : " + base + ", " + hight);
    }

    @Override
    void scale(double s) {
       // System.out.println("\t SCALAR = " + s);
        base *=s;
        hight *=s;
    }
}
