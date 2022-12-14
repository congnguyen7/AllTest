class Person {
    //khoi tao thuoc tinh cho lop
    private String name;
    private int age;
    private String address;

    //phuong thuc khoi tao
    public Person(String name, int age, String address) {
        // Khoi tao gia tri cho cac thuoc tinh cua doi tuong hien dang goi phuong thuc nay
        this.name=name;
        this.age=age;
        this.address=address;
    }
    //hien thi thong tin
    public void display() {
        System.out.println("Nhan vien " +name+ ", " +age+ " tuoi, tai dia chi "+address);
    }
}
