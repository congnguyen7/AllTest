package HuongDoiTuong2;

public abstract class Shape {
    //phuong thuc ao khong co dinh nghia
    public abstract double area();
    //tra lai thong tin de hien thi
    public String toString() {
        return "Dien tich la " + area();
    }
}
