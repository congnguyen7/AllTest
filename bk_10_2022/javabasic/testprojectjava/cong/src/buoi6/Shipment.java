package buoi6;

public class Shipment extends BotWeight {
    double cost; //tao them 1 bien
    //tao contructor co 1 doi so
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;

    }
    //tao constructor k co tham so
    Shipment(){
        cost = 0;
    }
    //constructor su dung // constructor used cube is create
    Shipment(double w, double h, double d,double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

}
