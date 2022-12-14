public class Employee extends Person {

    //tao them 2 thuoc tinh cho Employee
    private float salary;
    private float rate;
    // dinh nghia ham khoi tao cho lop Employee
    public Employee(String name, int age, String address, float salary, float rate) {
        //goi ham khoi tao cua lop Person de khoi tao thuoc tinh
        super(name, age, address);
        // khoi tao thuoc tinh cua Employee
        this.salary=salary;
        this.rate=rate;
    }
    // dinh nghia ham tinh tong luong
    public float totalSalary() {
        return salary*rate;
    }
    //dinh nghia ham hien thi thong tin cua Employee
    public void display() {
        //goi ham display cua lop Person de hien thi name,age va address
        super.display();
        //hien thi thong tin luong
        System.out.println(" co tong luong la: " +totalSalary());
    }

    public static void main(String[] args) {
        //tao doi tuong cua lop employee
        Employee A = new Employee("Cong",22,"Quang Tri", 1111,1.2f);
        //hien thi thong tin cua A
        A.display();
    }
}
