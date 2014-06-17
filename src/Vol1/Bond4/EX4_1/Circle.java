package Vol1.Bond4.EX4_1;

public class Circle {
    public double x,y;
    public double radius;

    public Circle(double x, double y , double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void move (double dx, double dy){
        x += dx;
        y += dy;
    }

    public boolean pointInCircle (double x, double y){
        if (leng(x, y, this.x, this.y) < radius) return true;
            else return false;
    }

    public boolean circleInCircle(Circle ob){
        if (leng(x, y, ob.x, ob.y ) + ob.radius < radius) return true;
            else return false;
    }

    public String toString(){
        return  "координаты центра " +x + ". " + y + " радиус окружности " + radius;
    }


    private double leng(double x,double y,double x1,double y1){
        return  Math.sqrt((x1 - x)*(x1 - x) + (y1 - y) * (y1 - y));
    }
}
