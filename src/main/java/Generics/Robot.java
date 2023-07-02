package Generics;

public class Robot <T extends Head>{

    private Body body;
    private T head;

    public <T1,T2 extends Head> Robot<?> foo(Robot<?> robot){

        return robot;
    }

    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }
}
