package JavaCapToc.buoi4;
//Overload Box.... va truyen Object cho tham so
class Box {
    double width;
    double height;
    double depth;

    // tao constructor. it takes an object of type box
    Box(Box ob) { //pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    //notice this constructor . it takes an object of type Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    //constructor used when all dimensions specified
    Box() {
        width = -1; //use -1 to indicate
        height = -1; //an uninitialized
        depth = -1; //box
    }
    //constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }
    //commute and return volume
    double vovlume() {
        return width * height * depth ;
    }
}
// tao constructor // tham so cua no chinh la class , it takes an object of type box


public class OverloadCons {
    public static void main(String[] args) {

        Box mybox1 = new Box(10,20,12);
        Box mybox2 = new Box();
        Box mycube = new Box(2);
        Box myclone = new Box(mybox1); // tao ra ban sao cua box1 //goi constructor ma tham so cua no la doi tuong

        double vol;
        //get volume of first box
        vol = mybox1.vovlume();
        System.out.println(" Volume of mybox1 is " + vol);

        //get volume of  second box
        vol = mybox2.vovlume();
        System.out.println(" Volume of mybox2 is " + vol);

        //get volume of  mycube box
        vol = mycube.vovlume();
        System.out.println(" Volume of mycube is " + vol);

        //get volume of  myclone box
        vol = myclone.vovlume();
        System.out.println(" Volume of myclone is " + vol);
    }

}
