package lld.decoratordesignpattern;

public class Decorator {


    public static void main(String[] args) {


        BasePizza basePizza = new extracheese(new Magherita());
        System.out.println(basePizza.cost());
    }
}
