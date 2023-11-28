/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoonRover;

/**
 * Represents the state of the rover when it is at rest.
 * This class extends the State class and defines specific behavior for the At Rest state.
 * 
 * @author gauravvraii
 * @version 1.0
 */
public class AtRest extends State {
    
    /**
     * Constructor for the AtRest class.
     * Initializes the name and subState attributes.
     */
    public AtRest() {
        this.name = "At Rest";
        this.subState = "None";
    }

    /**
     * Presses the right pedal to transition to the Move Forward state.
     * 
     * @param numOfTimesPressed The number of times the right pedal is pressed.
     * @return True if the right pedal is pressed exactly once; otherwise, returns false.
     */
    public Boolean pressRightPedal(int numOfTimesPressed) {
        if(numOfTimesPressed != 1) {
            System.out.println("Error: Can only press Right Pedal once when in At Rest State.\nUnable to move.");
            return false;
        } else {
            System.out.println("Transitioning from At Rest State to Move Forward State...");
            return true;
        }
    }

    /**
     * Presses the left pedal for a specified duration to transition to the Move Backward state.
     * 
     * @param numOfSecondsPressed The duration for which the left pedal is pressed (in seconds).
     * @return True if the left pedal is pressed for exactly 5 seconds; otherwise, returns false.
     */
    public Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        if(numOfSecondsPressed != 5) {
            System.out.println("Error: Must press Right Pedal for 5 seconds when in At Rest State.\nUnable to move.");
            return false;
        } else {
            System.out.println("Transitioning from At Rest State to Move Backward State...");
            return true;
        }
    }
}

