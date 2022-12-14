package HuongDoiTuong2;
public class Cricle extends Shape {
    // khai bao thuoc tinh ban kinh
    private double radius;
    //Phuong thuc khoi tao
    public Cricle(double rad) {
        radius = rad;
    }
    // dinh nghia lai phuong thuc dien tich
    public double area() {
        return Math.PI * radius *radius;
    }
}
