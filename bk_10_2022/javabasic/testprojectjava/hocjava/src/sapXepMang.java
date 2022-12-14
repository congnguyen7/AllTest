
public class sapXepMang {
    public static void main(String[] args) {
        int tempa = 0;
        int [] mangA = {2,4,1,5,9,2};
        for(int i=0;i< mangA.length-1;i++) {
            for (int j=i+1;j<mangA.length-1;j++) {
                if(mangA[i]>mangA[j]) {
                    tempa = mangA[i];
                    mangA[i]=mangA[j];
                    mangA[j]=tempa;
                }
            }
        }
        for (int k=0;k<=mangA.length;k++) {
            System.out.println(mangA[k]+ " ");
        }
    }
}
