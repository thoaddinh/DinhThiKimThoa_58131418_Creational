
package bt3;

public class main3 {

    public static void main(String[] args) {
        ShapeFactory s1 = ShapeFactory.createInstance();
        ShapeFactory s2 = ShapeFactory.createInstance();
        s1.createShape(ShapeType.circle);
        System.out.println(s1.createShape(ShapeType.circle).draw());
        
        s2.createShape(ShapeType.rectangle);
        System.out.println(s1.createShape(ShapeType.circle).draw());
        System.out.println(s2.createShape(ShapeType.rectangle).draw());
    }
    
}
