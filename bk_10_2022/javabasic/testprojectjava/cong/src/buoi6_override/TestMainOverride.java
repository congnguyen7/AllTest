package buoi6_override;

public class TestMainOverride {
    public static void main(String[] args) {
        //tao doi tuong
        SubClass o3 = new SubClass(2, 3, 4);
        o3.show(); //this calls show() trong subclass

//        ClassOverride o4 = new ClassOverride(2, 3);
//        o4.show(); //this calls show() trong super class

        ClassOverride o5 = new ClassOverride("cong");
        o5.show(); //this calls show() trong subclass

    }
}
