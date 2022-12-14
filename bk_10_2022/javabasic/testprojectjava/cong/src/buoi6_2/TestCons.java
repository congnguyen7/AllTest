package buoi6_2;

public class TestCons {
    //tao constructor k co tham so

    TestCons() {
        System.out.println("1. this is constructor of class TestCons ");
    }
}
class TestCons2 extends TestCons {
    //tao constructor
    TestCons2() {
        System.out.println("2. this is constructor of class TestCons2 ");
    }

}
class TestCons3 extends TestCons2 {
    //tao constructor
    TestCons3() {
        System.out.println("3. this is constructor of class TestCons3 ");
    }

}

class TestCons4 extends TestCons3 {
    //tao constructor
    TestCons4() {
        System.out.println("4. this is constructor of class TestCons4 ");
    }

}

