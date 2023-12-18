package hello.core.hello;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("jaewoo");
        helloLombok.setAge(28);
        System.out.println("helloLombok.getName() = " + helloLombok.getName());
    }
}
