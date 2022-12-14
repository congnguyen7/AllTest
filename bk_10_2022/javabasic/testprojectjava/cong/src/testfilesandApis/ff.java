package testfilesandApis;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class ff {
    public static void main(String[] args) throws URISyntaxException, IOException {
//        Path path = Path.of("c:\\dev\\licenses\\windows\\readme.txt");
//        System.out.println(path);
//
//        path = Path.of("c:/dev/licenses/windows/readme.txt");
//        System.out.println(path);
//
//        path = Path.of("c:" , "dev", "licenses", "windows", "readme.txt");
//        System.out.println(path);
//
        //Cách kiểm tra xem tệp có tồn tại không
        Path path = Path.of("/home/nvcong/nguyenvancongjava/bk_10_2022/javabasic/testprojectjava/javaFile123.txt");
        boolean exists = Files.exists(path);
        System.out.println("exists = " + exists);

        //xem ngay sua doi cuoi cung
        FileTime lastModifiedTime = Files.getLastModifiedTime(path);
        System.out.println("lastModifiedTime = " + lastModifiedTime);

        //xem chu so huu cua mot file
        UserPrincipal owner = Files.getOwner(path);
        System.out.println("owner = " + owner);

    }
}
