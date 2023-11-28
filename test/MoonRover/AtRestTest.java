/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package MoonRover;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for the AtRest class.
 * 
 * @author gauravvraii
 * @version 1.0
 */
public class AtRestTest {

    /**
     * Test the pressLeftPedalForTime method.
     */
    @Test
    public void testPressLeftPedalForTime() {
        // Arrange
        AtRest atRestInstance = new AtRest();
        
        // Act
        boolean result = atRestInstance.pressLeftPedalForTime(5);
        
        // Assert
        assertTrue(result);
    }
}


