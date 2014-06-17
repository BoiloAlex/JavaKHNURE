package Vol1.Bond10.B2TherdList;

public class Point implements Comparable{
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double get() {
        return (Math.sqrt(x * x + y * y));
    }

    @Override
    public int compareTo(Object o) {
        if (o == null ) return 0;
        Point obj = (Point) o;
        if (this.get()< obj.get())
            return -1;
        else if (this.get()> obj.get())
            return 1;
        else
        return 0;
    }

    public String toString (){
        return "x = " + String.format("%1$,.2f", x) + ", y = " + String.format("%1$,.2f", y )+ " get = " + String.format("%.2f",this.get())  + " ;";
    }
}
