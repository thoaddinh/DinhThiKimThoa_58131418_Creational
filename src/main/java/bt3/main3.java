
package bt3;

public class main3 {

    public static void main(String[] args) {
        Shape cir = ShapeFactory.createShape(ShapeType.circle);
        System.out.println(cir.draw());  
        Shape cir1 = ShapeFactory.createShape(ShapeType.rectangle);
        System.out.println(cir1.draw());
    }
    
}
