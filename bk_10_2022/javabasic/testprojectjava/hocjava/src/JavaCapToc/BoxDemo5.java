package JavaCapToc;

class Hop{
    double width;
    double height;
    double depth;

    //--------test constructor--------//
//    Hop() { // constructor//ham dựng dùng để tạo gia tri cho bien lop
//        System.out.println("Constructing Box");
//        width = 11;
//        height = 12;
//        depth = 18;
//    }
    //---------------------------------//
    //phuong thuc nay co kieu du lieu tra ve
    double volume() {
        return width * height * depth ;
    }
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
public class BoxDemo5 {
    public static void main(String[] args) {
        Hop mybox1 = new Hop();
        Hop mybox2 = new Hop();
        Hop mybox3 = new Hop();

        double vol;
        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);
        mybox3.setDim(2,2,10);


        vol = mybox1.volume();
        System.out.println("Volume is: " +vol);

        vol = mybox2.volume();
        System.out.println("Volume is: " +vol);

        vol = mybox3.volume();
        System.out.println("Volume is: " +vol);


    }
}
