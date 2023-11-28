/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * This class represents a Singleton pattern implementation.
 * 
 * @author gauravvraii
 * @version 1.0
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    
     /**
     * Private constructor to create a SingleObject instance.
     * This constructor is private to prevent external instantiation of the class.
     */

    private SingleObject() {
    }

    /**
     * Get the only object available.
     *
     * @return The instance of SingleObject.
    */
    
    public static SingleObject getInstance() {
        return instance;
    }
    /**
     * Display a message to the console.
     * This method prints "Hello World!" to the console.
     */
    
    public void showMessage() {
        System.out.println("Hello World!");
            
    }
}