/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package MoonRover;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for the State class.
 *
 * @author gauravvraii
 * @version 1.0
 */
public class StateTest {

    /**
     * Test constructor for the State class.
     */
    @Test
    public void testState() {
        fail("Not yet implemented");
    }

    /**
     * Test method for the pressRightPedal() method in the State class.
     */
    @Test
    public void testPressRightPedal() {
        // Arrange
        State s = new State();

        // Act & Assert
        assertFalse(s.pressRightPedal(1));
    }
}


