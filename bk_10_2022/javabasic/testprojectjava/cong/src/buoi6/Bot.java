package buoi6;

public class Bot { // Box
    //declare variable
    double width;
    double height;
    double depth;
    //constructors //co ten trung vs ten doi tuong //constructors clone of an object
    Bot(Bot ob) {  // parameter
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Bot(double w, double h, double d) { //constructor 3 parameter (all dimensions): contructor co 3 tham so
        width = w;
        height = h;
        depth = d;
    }
    //No dimension
    Bot() {
        width = 0;
        height = 0;
        depth = 0;
    }
    Bot(double len) {
        width = height = depth = len;
    }
    // tao phuong thuc tinh dien tich // create method calculate volume
    double volume() {//
        return width * height * depth;
        }

}
