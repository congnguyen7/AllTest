package JavaCapToc;

class Box {
    //khai bao cac phuong thuc tinh
    double width;
    double height;
    double depth;
//khai bao cac phuong thuc tinh the tich
// kieu du lieu Name(){
    //body
//}
void volume(){
//    System.out.print("Volume is ");
    System.out.println(width * height * depth);
}
double volu(){
    return width * height * depth;
}

}// the end of class Box

class BoxDemo {
    public static void main(String[] args) {
        double vol;

        //tạo đối tượng 1
        Box mybox = new Box();   //lệnh tao doi tuong (để gọi phương thức)
//        Box la mot class, //Box(): no la phuong thuc đặc biệt trùng với , () constructor

//        gán giá trị cho các đối tượng
        mybox.width = 10;           //mybox : đối tượng width: thuộc tính
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume1 is " + vol);
//        goi phuong thuc (goi ham) (method)  //goi ham da tao
//        mybox.volume();

//        tao doi tuong thu 2
        Box box2 = new Box();
        box2.width = 20;
        box2.height = 20;
        box2.depth = 20;
        System.out.print("Volume2 is ");
        box2.volume();      // gọi phương thức volume() của đối tượng box2

        //goi ham volu();
        System.out.println(mybox.volu());
        System.out.println(box2.volu());
        System.out.println(mybox.volu() + box2.volu());

    }
}
