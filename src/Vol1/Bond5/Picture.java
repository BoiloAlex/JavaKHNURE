package Vol1.Bond5;

public class Picture extends Rectangle {

    Point[] arrayInPicture;
    int count = 0;

    public Picture(double x, double y, double sideA, double sideB) {
        super(x, y, sideA, sideB);
        arrayInPicture = new Point[10];
    }

    public void Add(Point obj) {
        if (count == arrayInPicture.length) {
            Point[] temp = new Point[arrayInPicture.length * 2];
            for (int i = 0; i < temp.length; i++)
                temp[i] = arrayInPicture[i];
            arrayInPicture = temp;
        }
        arrayInPicture[count++] = obj;
    }

    public void movePicture(double dx, double dy) {
        System.out.println ("\t MOVE dx = " + dx + ", dy = " + dy);
        for (int i = 0 ; i < count; i++)
            arrayInPicture[i].move(dx, dy);
        this.x += dx;
        this.y += dy;
    }

    public void print(){

        System.out.println("Picture \t(x,y): " + x + ", "+ y + " side's : " + sideA + ", " + sideB);
            for (int i = 0; i < count; i++) {
                System.out.print(i + " elem : ");
                arrayInPicture[i].print();
    }
    }
}
