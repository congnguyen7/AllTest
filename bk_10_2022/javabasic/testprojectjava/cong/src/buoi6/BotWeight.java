package buoi6;
//create class BotWeight extends from class Bot
public class BotWeight extends Bot{
    //them thuoc tinh can nang
    double weight;
    //1 constructor clone of an object
    BotWeight(BotWeight ob) {
//        width = ob.width;
//        height = ob.height;
//        depth = ob.depth;
        super(ob);
        weight = ob.weight; //add
    }
    BotWeight(double w, double h, double d, double m) { //constructor 3 parameter (all dimensions): contructor co 3 tham so
//        width = w;
//        height = h;
//        depth = d;
        super(w, h, d);
        weight = m;

    }
    //No dimension
    BotWeight() {
//        width = 0;
//        height = 0;
//        depth = 0;
        super();
        weight = 0;
    }
    BotWeight(double len, double m) {
        width = height = depth = len;
        weight = m;

    }
    // tao phuong thuc tinh dien tich // create method calculate volume
    double volume() {//
        return width * height * depth;
    }

}
