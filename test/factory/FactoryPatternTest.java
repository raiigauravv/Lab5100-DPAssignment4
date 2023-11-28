/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * FactoryPatternTest class for testing the ShapeFactory.
 *
 * @author gauravvraii
 * @version 1.0
 */
public class FactoryPatternTest {
    
    /**
     * Test case for creating a Circle object using the ShapeFactory.
     * It checks if the returned object is an instance of the Circle class.
     */
    @Test
    public void testGetCircle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        assertEquals("Expected Circle object", Circle.class, circle.getClass());
    }
    
    /**
     * Test case for creating a Rectangle object using the ShapeFactory.
     * It checks if the returned object is an instance of the Rectangle class.
     */
    @Test
    public void testGetRectangle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        assertEquals("Expected Rectangle object", Rectangle.class, rectangle.getClass());
    }
    
    /**
     * Test case for creating a Square object using the ShapeFactory.
     * It checks if the returned object is an instance of the Square class.
     */
    @Test
    public void testGetSquare() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = shapeFactory.getShape("SQUARE");
        assertEquals("Expected Square object", Square.class, square.getClass());
    }
    
    /**
     * Test case for attempting to create an invalid shape using the ShapeFactory.
     * It checks if null is returned for an invalid shape.
     */
    @Test
    public void testInvalidShape() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape invalidShape = shapeFactory.getShape("TRIANGLE");
        assertNull("Expected null for invalid shape", invalidShape);
    }
}
