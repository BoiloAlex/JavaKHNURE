package Vol1.Bond4.EX4_1;

public class CircleDemo {
    public static void main (String[] args){
        Circle ob1 = new Circle(4,5,6);// создание нового объекта
        System.out.println(ob1);

        ob1.move(1, 3); //сдвиг центра
        System.out.println("Сдвинули на 1, 3" + ob1);

        System.out.println("точка 111, 111 в круге? " + ob1.pointInCircle(111,111));

        Circle ob2 = new Circle(5, 5, 2);// создание нового объекта
        System.out.println("окружность "+ ob2 + " находится внутри круга? "+ ob1.circleInCircle(ob2));
    }
}
