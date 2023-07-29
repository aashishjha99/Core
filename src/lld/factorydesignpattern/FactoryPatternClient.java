package lld.factorydesignpattern;

public class FactoryPatternClient {


    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        shape shape1 = shapeFactory.getShape("CIRCLE");
        shape shape2 = shapeFactory.getShape("SQUARE");
        shape shape3 = shapeFactory.getShape("SQUAREs");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
