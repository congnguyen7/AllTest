package JavaCapToc.buoi4;

class  Test1{
    int a,b;
    Test1(int i, int j) {
        a = i;
        b = j;
    }


//    int a,b;
//    void meth(int i, int j) {
//        i *= 2;
//        j /=2;
//        System.out.println("trong method " + i +" va "+ j);
//    }


    //pass an object
    void meth1(Test1 o) {
        o.a *= 2;
        o.b /=2;
    }
}


public class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1(15,20);
//        Test1 ob = new Test1();

//        int a = 15, b = 20;

//        System.out.println("a and b before call: " + a + " "+ b);
//        ob.meth(a,b);
//        System.out.println("a and b after call: " + a + " " +b);

        System.out.println("a and b before call: " + ob.a + " "+ ob.b);
        ob.meth1(ob);
        System.out.println("a and b after call: " + ob.a + " " +ob.b);
    }

}
