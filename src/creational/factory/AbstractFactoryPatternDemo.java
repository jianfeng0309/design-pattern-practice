package creational.factory;

/**
 * Created by GuoJianFeng on 11/2/17.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of factory.Shape factory.Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of factory.Shape factory.Circle
        shape1.draw();

        //get an object of factory.Shape factory.Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of factory.Shape factory.Rectangle
        shape2.draw();

        //get an object of factory.Shape factory.Square
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of factory.Shape factory.Square
        shape3.draw();

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of factory.Color factory.Red
        Color color1 = colorFactory.getColor("RED");

        //call fill method of factory.Red
        color1.fill();

        //get an object of factory.Color factory.Green
        Color color2 = colorFactory.getColor("factory.Green");

        //call fill method of factory.Green
        color2.fill();

        //get an object of factory.Color factory.Blue
        Color color3 = colorFactory.getColor("BLUE");

        //call fill method of factory.Color factory.Blue
        color3.fill();
    }
}
