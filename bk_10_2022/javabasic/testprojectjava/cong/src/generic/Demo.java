package generic;

class Book<T> implements writer<T> {
    @Override
    public void update(T obj) {
        // do something
    }
    @Override
    public void delete(T obj) {
        // do something
    }
    @Override
    public void write(T obj) {
        // do something
    }
}
public class Demo {
    public static void main(String[] args) {
        Book<String> t = new Book<String>();
        t.write("Add data to book");
    }
}