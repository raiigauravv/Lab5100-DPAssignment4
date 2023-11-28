/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test for the SingleObject class, which implements the Singleton pattern.
 * 
 * @author gauravvraii
 * @version 1.0
 */
public class SingletonPatternTest {

    /**
     * Test for the Singleton pattern getInstance() method.
     * 
     * This test ensures that the getInstance() method of the SingleObject class
     * returns the same instance when called multiple times.
     */
    @Test
    public void testGetInstance() {
        // Arrange
        SingleObject instance1 = SingleObject.getInstance();
        SingleObject instance2 = SingleObject.getInstance();

        // Act/Assert
        // Check if both instances are the same
        assertSame("getInstance() should return the same instance", instance1, instance2);
    }
}
