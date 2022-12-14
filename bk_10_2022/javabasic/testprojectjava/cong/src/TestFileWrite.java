import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWrite {
    public static void main(String[] args) {

        String txt = "hello ";
        try {
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(txt);
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
