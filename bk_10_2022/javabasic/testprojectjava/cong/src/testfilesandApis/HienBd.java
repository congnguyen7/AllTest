package testfilesandApis;

public class HienBd {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số ban đầu: ");
////        int hien = scanner.nextInt();
        //1 for
        int hien = 250;
        int sum =0;
        for (int i=1;i<=17;i++) {
            hien = hien + 10;
            sum += hien;
            System.out.println("Kết quả bước nhảy thứ " +i+ " là: "+ hien) ;

        //while
//        int hien=250;
//        int i=0;
//        while (i<17) {
//            hien = hien + 10;
//            i++;
//            System.out.println("Kết quả bước nhảy thứ " +i+ " là: "+ hien) ;

        }
        System.out.println(sum);
    }
}
