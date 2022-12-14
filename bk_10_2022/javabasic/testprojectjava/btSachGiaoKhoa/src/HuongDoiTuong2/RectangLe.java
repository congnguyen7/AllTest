package HuongDoiTuong2;

public class RectangLe extends Shape {
    //khai bao hai thuoc tinh chieu rong va chieu cao cua lop RectangLe
    private double width, height;
    //dinh nghia ham khoi tao
    public RectangLe(double wVal, double hVal) {
        width = wVal;
        height = hVal;
    }
    public double area() {
        return width*height;
    }

}
