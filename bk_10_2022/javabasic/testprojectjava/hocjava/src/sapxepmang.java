public class sapxepmang {
    public static void main(String[] args) {
        int temp = 0;
        int [] mangA = {2,4,1,5,9,2};
        for(int i=0;i<mangA.length;i++) {
            for (int j=i+1;j<mangA.length;j++) {
                if(mangA[i]>mangA[j]) {
                    temp = mangA[j];
                    mangA[j]=mangA[i];
                    mangA[j]=temp;
                }
            }
        }
        for (int k=0;k<=mangA.length;k++) {
            System.out.println(mangA[k]);
        }

    }
}
