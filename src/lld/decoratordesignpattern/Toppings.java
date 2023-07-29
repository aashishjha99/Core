package lld.decoratordesignpattern;

public abstract class Toppings extends BasePizza {

    BasePizza basePizza;

    public Toppings(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

}
