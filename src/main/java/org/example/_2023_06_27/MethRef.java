package org.example._2023_06_27;

public class MethRef {
    public static void main(String[] args) {
        m2(MethRef::r2);
    }

    public static void r2() {
        System.out.println("@@@@");
        System.out.println("@@@@");
    }

    public static void m2(Met met) {
        met.get();
    }

}

@FunctionalInterface
interface Met {
    void get();
}
