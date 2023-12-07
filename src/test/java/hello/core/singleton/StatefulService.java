package hello.core.singleton;

public class StatefulService {

    // 이렇게 공유필드에 저장하는 것을 조심 (스프링 빈은 항상 무상태성을 유지하자)
    //private int price;

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        //this.price = price; // 이렇게 하지 말자는 것
        return price;
    }
}
