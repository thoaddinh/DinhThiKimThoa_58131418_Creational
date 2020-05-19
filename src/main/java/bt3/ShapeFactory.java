
package bt3;

public class ShapeFactory {
    private static ShapeFactory singleton;
    public Shape createShape(ShapeType shapeType){
        switch(shapeType){
            case circle:
                return new Circle();
            case triangle:
                return new Triangle();
            case rectangle:
                return new Rectangle();
        }
        return null;
    }

    public ShapeFactory() {
    }
    public static ShapeFactory createInstance()
    {
        if(singleton == null)
            singleton = new ShapeFactory();
        return singleton;
    }
}
