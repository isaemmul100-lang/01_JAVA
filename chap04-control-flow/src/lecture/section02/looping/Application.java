package lecture.section02.looping;

import lecture.section01.conditional.B_if_elseif;
import lecture.section01.conditional.C_switch;

public class Application {

    public static void main(String[] args) {

        A_for a = new A_for();
        B_while b = new B_while();
        C_doWhile c = new C_doWhile();
        D_continue d = new D_continue();

//        a.sampleFor();
//        b.sampleWhile();
//        c.sampleDoWhile();
        d.sampleContinue();


    }
}
