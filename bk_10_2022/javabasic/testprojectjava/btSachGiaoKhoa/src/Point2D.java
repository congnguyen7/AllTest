public class Point2D {
    //Khai bao 2 thuoc tinh x va y
    private float x,y;
    //ham khoi tao mac dinh
    public Point2D() {
        this.x=0;
        this.y=0;
    }
    //ham khoi tao hai thuoc tinh
    public Point2D(float x, float y) {
        this.x=x;
        this.y=y;
    }
    //thay doi vi tri moi
    public void move(float dx,float dy) {
        x+=dx;
        x+=dy;
    }
    //tinh khoang cach tu diem hien tai den diem A
    public double distance(Point2D A) {
        //su dung ham sqrt va pow cua lop math de tinh can bac hai va mu
        return Math.sqrt(Math.pow(this.x-A.x,2)+Math.pow(this.y-A.y,2));
    }
    //hien thi toa do hien tai
    public void display() {
        System.out.println("("+x+","+y+")");
    }

    public static void main(String[] args) {
        // tai hai diem a va b
        Point2D A,B;
        A=new Point2D(3,4);
        B=new Point2D(6,7);
        //hien thi toa do cua A va B
        System.out.println("A co toa do la: "); A.display();
        System.out.println("B co toa do la: "); B.display();
        //di chuyen den vi tri moi
        A.move(4,2);
        //hien thi toa do A o vi tri moi
        System.out.println("Toa do moi cua A la: "); A.display();
        //Tinh khoang cach tu diem A den diem B
        double d = A.distance(B);
        System.out.println(" Khoan cach tu diem A den diem B la: "+d);
    }
}
