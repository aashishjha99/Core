package lld.decoratordesignpattern;

public class extracheese extends  Toppings{


    public extracheese(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return this.basePizza.cost() +100;
    }
}
