package generic;
//su dung generic trong method
//viet method in ra dc tat ca cac phan tu cua 3 mang
public class GenericInMethod {
    //
    public static <T> void printElement(T[] t) {
        for (T o: t) {
            System.out.print(o+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Integer[] myArray1 = {1,2,3,4,5};
        Double[] myArray2 = {1.2,2.2,3.3,4.4,5.5};
        String [] myArray3 = {"Hello0", "stringg1"};

        printElement(myArray1);
        printElement(myArray2);
        printElement(myArray3);


    }
}
