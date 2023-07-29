package lld.factorydesignpattern;


public class ShapeFactory {


     shape getShape(String msg) {
        switch (msg) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }


}
