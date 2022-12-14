package buoi10_bt;

import java.util.ArrayList;
import java.util.Comparator;

public class ClassMethod {
    //phuong thuc tu he 10 sang 2
    public static void DeToBi(int n) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        while (n > 0) {
            arrayList1.add(n % 2);
            n = n / 2;
        }
        arrayList1.sort(Comparator.reverseOrder());
        System.out.print("toBinary: ");
        for (int i : arrayList1) {
            System.out.print(i);
        }
        System.out.println();
    }

    //phuong thuc tu he 2 sang he 10
    public static int BitoDe(int n) {
        int d = 0;
        int i = 0;
        int re;

        while (n != 0) {
            re = n%10;
            n=n/10;
            d += re*Math.pow(2,i);
            i++;
        }
        return d;
    }
    //tao phuong thuc checkPrime(true/false)
    public boolean checkPrime(int n) {
        if(n<=1) {
            return false;
        }
        else {
            for (int i=2;i<Math.sqrt(n);i++) {
                if(n%i==0) {
                    return false;
                }
            }
        }
        return true;
    }
    //create method checkPerfect (true/false)
//    public boolean checkPerfect(int n) {
//        int sum;
//        for (int i=0; i<n;) {
//
//        }
//    }
    //tao phuong thuc chuyen 10 thanh 16
    public String DetoMe(int n) {
        String result = "";
        int re;
        char hex []={'0','1','2','3','4','5','6','7','8','9','A','B','C','D'};
        while (n>0){
            re=n%16;
            result=hex[re]+result;
            n=n/16;

        }
        return result;
    }
}
