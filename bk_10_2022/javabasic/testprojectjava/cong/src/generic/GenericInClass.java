package generic;

public class GenericInClass <K, V>{
    private K key;
    private V value;

//Co the truyen nhieu tham so vao Generic class
    public GenericInClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }


    public static void main(String[] args) {
        GenericInClass <Integer, String> g1 = new GenericInClass(1,"one");
        GenericInClass <String, Integer> g2 = new GenericInClass("two",2);

        System.out.println(g1.getKey()+" "+g1.getValue());

        //dao nguoc kieu du lieu key, value
        System.out.println(g2.getKey()+" "+g2.getValue());


    }
}
