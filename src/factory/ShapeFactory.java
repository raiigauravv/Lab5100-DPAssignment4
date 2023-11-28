/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 * The ShapeFactory class is responsible for creating different shapes based on the provided shape type.
 * It uses the Factory Method design pattern to instantiate and return specific shape objects.
 * 
 * @author gauravvraii
 * @version 1.0
 */
public class ShapeFactory {
    /**
     * This method returns a shape object based on the specified shape type.
     * 
     * @param shapeType A String representing the type of shape to be created (e.g., "CIRCLE", "RECTANGLE", "SQUARE").
     * @return A Shape object corresponding to the specified shape type. Returns null if the shape type is not recognized.
     */
    
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

