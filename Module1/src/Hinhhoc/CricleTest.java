package Hinhhoc;

import java.awt.*;

public class CricleTest {
    public static void main(String[] args) {
        Circle cricle = new Circle();
        System.out.println(cricle);
        cricle = new Circle(2.5);
        System.out.println(cricle);
        cricle = new Circle(2.5,"blue",false);
        System.out.println(cricle);

    }
}
