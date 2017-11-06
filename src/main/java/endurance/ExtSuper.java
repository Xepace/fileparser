package endurance;

import java.util.ArrayList;
import java.util.List;

public class ExtSuper extends Super {
    static int a = 1;
    int b = 1;

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        System.out.println(sum(a,b));
    }
    private static double sum(double a, double b) {
        return a + b;
    }

    public void addElement(final List arg){
        BufferRe
        arg.add("addItem");
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        ExtSuper.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
