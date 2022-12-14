package classesobjects;

public class ClassesObjects {

    public static void main(String[] args) {
        Cat tom = new Cat();

        tom.name = "Tom";
        tom.age = 6;

        System.out.println("cat's name" + tom.name);
        tom.move();

        Students cong = new Students();
        cong.name = "Nguyen Van Cong";
        cong.email = "nvcong";
        System.out.println("name: " + cong.name);
    }
    
}
