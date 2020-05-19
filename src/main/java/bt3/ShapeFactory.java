
package bt3;

public class ShapeFactory {
    private static Shape shape;
    
    public static Shape createShape(ShapeType shapeType){
        if(shape == null){
            switch (shapeType) {
                case circle:
                    shape = new Circle();
                    break;
                case rectangle:
                    shape = new Rectangle();
                    break;
                case triangle:
                    shape = new Triangle();
                    break;
            }
        }
        return shape;
    }
}
