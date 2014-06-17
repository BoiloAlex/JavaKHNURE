package Vol1.Bond5;

abstract public class Point {
    double x,y;
    abstract public void print();
    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy){
        x +=dx;
        y +=dy;
    }

    abstract void scale(double s);   //масштабирование
}
