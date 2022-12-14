package buoi8_tt;

public class AskMe implements  InterfaceConstants{
    static void answer(int result) {
        switch (result){
            case N0:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Mayby");
                break;
            case LAYTER:
                System.out.println("Layter");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        System.out.println(q.ask());

        AskMe askMe = new AskMe();

        //goi method khong thong qua doi tuong. vi co tu khoa static
        answer(q.ask());

    }
}
