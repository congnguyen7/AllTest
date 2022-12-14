package Files_Apis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class FileDemo {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("javaFile123.txt");
            if (file.createNewFile())
                System.out.println("New file is create!");
            else
                System.out.println("File already exists");
        }catch (IOException e) {
            e.printStackTrace();
        }


//        show file in folder
//        File f=new File("/home/nvcong/nguyenvancongjava/bk_10_2022/javabasic/testprojectjava");
//        String filenames[]=f.list();
//        for(String filename:filenames){
//            System.out.println(filename);
//        }

//        show file and tinh trang file
//        File dir=new File("/home/nvcong/nguyenvancongjava/bk_10_2022/javabasic");
//        File files[]=dir.listFiles();
//        for(File file:files){
//            System.out.println(file.getName()+" Can Write: "+file.canWrite()+" Is Hidden: "+file.isHidden()+" Length: "+file.length()+" bytes");
//        }
        //readfile
//        File file = new File("/home/nvcong/nguyenvancongjava/bk_10_2022/javabasic/testprojectjava/cong/file.txt");
//        Scanner scanner = new Scanner(file);
//
//        if (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            System.out.println(line);
//
//        }

    }
}
