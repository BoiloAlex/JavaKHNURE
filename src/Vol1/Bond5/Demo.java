package Vol1.Bond5;


public class Demo {
    public static void main(String[] args){
        Picture pic = new Picture(0,0, 10,10);
        pic.Add(new Triangle(0,0,2,2));
        pic.Add(new Rectangle(2,2,3,1));
        pic.Add(new Rectangle(2,4,3,1));
        pic.Add(new Triangle(2,6,2,2));
        //for (Point x : pic.arrayInPicture)
                // не работает, т.к. не на весь массив, а только до count
        /*for (int i = 0; i < pic.count; i++)
            pic.arrayInPicture[i].print();*/
        pic.print();

        pic.movePicture(4,5);
        pic.print();
        pic.scale(2);
        pic.print();
    }

}
