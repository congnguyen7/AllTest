package JavaCapToc;

class Thu {
    double gt(int n) {
        int p=1;
        for (int i=1; i<n ; i++) {
            p=p*i;
        }
        return p;
    }
}

public class giaiThua {
    public static void main(String[] args) {
        Thu o = new Thu();
        double s=0;
        for (int j=1; j<10; j++) {
            s=s+o.gt(j);
        }

        System.out.println(" Ket qua " + s);
    }
}