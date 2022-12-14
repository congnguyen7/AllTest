package buoi8_tt;

import java.util.Random;

public class Question implements InterfaceConstants{
    Random ran = new Random(); //0.0 1.0
    int ask() {
        int prob = (int) (100 * ran.nextDouble()); //0 -100
    if (prob<30)
        return N0;
    else if(prob<60)
        return YES;
    else if (prob<75)
        return LAYTER;
    else if (prob<98)
        return SOON;
    else
        return NEVER;
    }
}
