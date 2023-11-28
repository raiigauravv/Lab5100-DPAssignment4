/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoonRover;

/**
 * Represents the state of the moon rover.
 * Provides methods for pressing the right and left pedals.
 * 
 * @author gauravvraii
 * @version 1.0
 */
public class State {
    /** 
     * The name of the state. Default is "NULL".
     */
    protected String name = "NULL";

    /**
     * The sub-state of the state. Default is "NULL".
     */
    protected String subState = "NULL";

    /**
     * Default constructor for the State class.
     */
    public State() {}

    /** 
     * Simulates pressing the right pedal a specified number of times.
     * 
     * @param numOfTimesPressed The number of times the right pedal is pressed.
     * @return Boolean Returns true if the right pedal is successfully pressed, otherwise false.
     */
    public Boolean pressRightPedal(int numOfTimesPressed) {
        return false;
    }
    
    /** 
     * Simulates pressing the right pedal for a specified duration.
     * 
     * @param numOfSecondsPressed The duration for which the right pedal is pressed (in seconds).
     */
    protected void pressRightPedalForTime(int numOfSecondsPressed) {}

    /**
     * Simulates pressing the left pedal a specified number of times.
     * 
     * @param numOfTimesPressed The number of times the left pedal is pressed.
     * @return Boolean Returns true if the left pedal is successfully pressed, otherwise false.
     */
    protected Boolean pressLeftPedal(int numOfTimesPressed) {
        return false;
    }

    /**
     * Simulates pressing the left pedal for a specified duration.
     * 
     * @param numOfSecondsPressed The duration for which the left pedal is pressed (in seconds).
     * @return Boolean Returns true if the left pedal is successfully pressed, otherwise false.
     */
    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        return false;
    }

    /**
     * Simulates pressing the left pedal for a specified duration without returning a value.
     * 
     * @param numOfSecondsPressed The duration for which the left pedal is pressed (in seconds).
     */
    protected void voidPressLeftPedalForTime(int numOfSecondsPressed) {}
}
