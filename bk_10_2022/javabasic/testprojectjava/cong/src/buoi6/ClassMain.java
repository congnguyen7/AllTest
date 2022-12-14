package buoi6;

public class ClassMain {
    public static void main(String[] args) {
        //create 2 object for BotWeight (Bot1 and Bot2)
        //tao doi tuong 1
        BotWeight bot1 = new BotWeight(10,20,30,5);

        double vol;
        vol = bot1.volume();
        System.out.println(" Volume of bot1 is " +vol);
        System.out.println(" Weight of bot1 is "+bot1.width);
        System.out.println(" Height of bot1 is "+bot1.height);
        System.out.println(" Depth of bot1 is "+bot1.depth);
        System.out.println(" Weight of bot1 is "+bot1.weight);

        BotColor bot2 = new BotColor(10,20,30,"Green");

        System.out.println(" Volume of bot2 is " +vol);
        System.out.println(" Weight of bot2 is "+bot2.width);
        System.out.println(" Height of bot2 is "+bot2.height);
        System.out.println(" Depth of bot2 is "+bot2.depth);
        System.out.println(" Weight of bot2 is "+bot2.color);

        //---------//
        //create object for Shipment (width,h,d)
        Shipment ob3 = new Shipment(3.5,4.5,5.5,12.5,100.5);
        System.out.println(" Volume of bot3 is " +vol);
        System.out.println(" Weight of bot3 is "+ob3.width);
        System.out.println(" Height of bot3 is "+ob3.height);
        System.out.println(" Depth of bot3 is "+ob3.depth);
        System.out.println(" Cost of bot3 is "+ob3.cost);
//        System.out.println(" Cost of bot2 is "+ob3.color); // k ke thua cua color

    }
}
