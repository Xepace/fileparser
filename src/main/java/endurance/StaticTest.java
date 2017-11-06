package endurance;

import java.util.ArrayList;
import java.util.List;

public class StaticTest {
    static Integer integer;

    public static void main(String[] args) {
        char a = 0;
        for(int i = 0; i< 128;i++){
            System.out.println(a++);
        }
//        System.out.println(a);
        System.out.println(integer+"?");
        double d = 1.0;
        float f = 2.0f;
        float sum = (float)( f + d);
        System.out.println(sum);
        ExtSuper extSuper = new ExtSuper();
        List list = new ArrayList();
        extSuper.addElement(list);
        System.out.println(list);
        TestEnum testEnum = TestEnum.ONE;
        System.out.println(TestEnum.TWO);
    }
}
