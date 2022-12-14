package HuongDoiTuong2;

public class TestShape {
    public static void main(String[] args) {
        //tao mot mang kieu Shape va khoi tao cac doi tuong Circle, ReTangLe cho tang phan tu cua mang
        Shape [] vec = { new Cricle(3),new RectangLe(4,5),new Cricle(4),new Cricle(8)};
        //goi ham toString de in cac phan tu cua mang
        for (int index = 0;index< vec.length;index++) {
            System.out.println(vec[index]);
        }
    }
}
