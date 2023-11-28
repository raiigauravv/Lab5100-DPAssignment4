/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * FacadePatternTest class to test the ShapeMaker class.
 * 
 * @author gauravvraii
 * @version 1.0
 */
public class FacadePatternTest { 
    
    /**
     * Test the drawCircle method in the ShapeMaker class.
     */
    @Test
    public void testDrawCircle() {
        // Arrange
        ShapeMaker shapeMaker = new ShapeMaker();
        
        // Act and Assert
        // Assuming Circle's draw method returns "Drawing Circle" 
        assertEquals("Drawing Circle", shapeMaker.drawCircle());
    }

    /**
     * Test the drawRectangle method in the ShapeMaker class.
     */
    @Test
    public void testDrawRectangle() {
        // Arrange
        ShapeMaker shapeMaker = new ShapeMaker();
        
        // Act and Assert
        // Assuming Rectangle's draw method returns "Drawing Rectangle"
        assertEquals("Drawing Rectangle", shapeMaker.drawRectangle());
    }

    /**
     * Test the drawSquare method in the ShapeMaker class.
     */
    @Test
    public void testDrawSquare() {
        // Arrange
        ShapeMaker shapeMaker = new ShapeMaker();
        
        // Act and Assert
        // Assuming Square's draw method returns "Drawing Square"
        assertEquals("Drawing Square", shapeMaker.drawSquare());
    }
}


