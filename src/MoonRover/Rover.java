/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoonRover;

/**
 * Rover class represents a moon rover with different states and movements.
 * 
 * @author gauravvraii
 * @version 1.0
 */
public class Rover {
    protected State currentState = new AtRest();

    /**
     * Default constructor for the Rover class.
     */
    public Rover() {}

    /**
     * Accelerates the rover by pressing the right pedal a specified number of times.
     * Changes the state to MoveForward if in the At Rest state.
     * 
     * @param numOfTimesPressed The number of times the right pedal is pressed.
     */
    protected void pressRightPedal(int numOfTimesPressed) {
        Boolean move;
        switch (this.currentState.name) {
            case "At Rest":
                move = this.currentState.pressRightPedal(numOfTimesPressed);
                if(move){ // no error
                    this.currentState = new MoveForward(); // current state becomes state MoveForward
                }
                break;
            case "Move Forward":
                move = this.currentState.pressRightPedal(numOfTimesPressed);
                // current state only changes to At Rest State if numOfTimesPressed is 3
                if(move) {
                    this.currentState = new AtRest();
                }
                break;
            default:
                System.out.println("Error: Can only press Right Pedal when in At Rest or inside Move Forward States.\nUnable to move.");
                break;
        }
    }

    /**
     * Presses the right pedal for a specified duration when in the Move Forward state.
     * 
     * @param numOfSecondsPressed The duration for which the right pedal is pressed.
     */
    protected void pressRightPedalForTime(int numOfSecondsPressed) {
        if(this.currentState.name == "Move Backward" || this.currentState.name == "At Rest") {
            System.out.println("Error: Can only press Right Pedal for Time when inside Move Forward State.\nUnable to move.");
            return;
        }
        this.currentState.pressRightPedalForTime(numOfSecondsPressed);
    }

    /**
     * Decelerates the rover by pressing the left pedal a specified number of times.
     * Changes the state to At Rest if in the Move Forward state.
     * 
     * @param numOfTimesPressed The number of times the left pedal is pressed.
     */
    protected void pressLeftPedal(int numOfTimesPressed) {
        if(this.currentState.name == "Move Forward" || this.currentState.name == "At Rest") {
            System.out.println("Error: Can only press Left Pedal when inside Move Backward State.\nUnable to move.");
            return;
        }
        Boolean move = this.currentState.pressLeftPedal(numOfTimesPressed);
        // current state only changes to At Rest State if numOfTimesPressed is 3
        if(move) {
            this.currentState = new AtRest();
        }
    }

    /**
     * Presses the left pedal for a specified duration when in the At Rest state.
     * Changes the state to MoveBackward if successful.
     * 
     * @param numOfSecondsPressed The duration for which the left pedal is pressed.
     */
    protected void pressLeftPedalForTime(int numOfSecondsPressed) {
        switch (this.currentState.name) {
            case "At Rest":
                Boolean move = this.currentState.pressLeftPedalForTime(numOfSecondsPressed);
                if(move) { // no error
                    this.currentState = new MoveBackward(); // current state becomes state MoveBackward
                }
                break;
            case "Move Backward":
                this.currentState.voidPressLeftPedalForTime(numOfSecondsPressed);
                break;
            default:
                System.out.println("Error: Can only press Left Pedal for Time when in At Rest or inside Move Backward States.\nUnable to move.");
                break;
        }
    }

    /**
     * Prints the current state and sub-state of the rover.
     */
    protected void printStateAndSubState() {
        System.out.println("Current State: " + this.currentState.name);
        System.out.println("Current SubState: " + this.currentState.subState);
    }

    /**
     * Main method for testing the Rover class.
     * 
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Rover rover = new Rover();

        // Move Forward State 
        rover.pressRightPedal(1); // Move Forward - Accelerate
        rover.printStateAndSubState();
        rover.pressRightPedalForTime(5); //ConstantSpeed
        rover.printStateAndSubState();
        rover.pressRightPedalForTime(3); //Decelerate
        rover.printStateAndSubState();
        rover.pressRightPedal(2); //Accelerate
        rover.printStateAndSubState();
        rover.pressRightPedal(3); //Error
        rover.printStateAndSubState();
        rover.pressRightPedal(2); // Decelerate
        rover.printStateAndSubState();

        // Transition to At Rest
        rover.pressRightPedal(3);
        rover.printStateAndSubState();

        // Move Backward State
        rover.pressLeftPedalForTime(5); // Move Backward - Accelerate
        rover.printStateAndSubState();
        rover.pressLeftPedalForTime(3); // ConstantSpeed
        rover.printStateAndSubState();
        rover.pressLeftPedal(1); // Decelerate
        rover.printStateAndSubState();
        rover.pressLeftPedal(2); // Accelerate
        rover.printStateAndSubState();
        rover.pressLeftPedal(3); // Error
        rover.printStateAndSubState();
        rover.pressLeftPedal(2); // Decelerate
        rover.printStateAndSubState();
        rover.pressLeftPedal(3); // At Rest
        rover.printStateAndSubState();
    }
}