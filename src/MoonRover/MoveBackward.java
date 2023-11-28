/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoonRover;

/**
 * The MoveBackward class represents the state of moving backward in the Moon Rover system.
 * This class extends the State class and provides specific behavior for moving backward.
 *
 * @author gauravvraii
 * @version 1.0
 */
public class MoveBackward extends State {

    /**
     * Constructs a MoveBackward object with default values for the name and subState.
     */
    MoveBackward() {
        this.name = "Move Backward";
        this.subState = "Accelerate";
    }

    /**
     * Presses the left pedal to control the movement when in the Move Backward state.
     *
     * @param numOfTimesPressed The number of times the left pedal is pressed.
     * @return A Boolean indicating whether the move is successful.
     */
    protected Boolean pressLeftPedal(int numOfTimesPressed) {
        Boolean move = false;
        switch (numOfTimesPressed) {
            case 1:
                if(this.subState != "Decelerate" && this.subState != "Constant Speed") {
                    System.out.println("Error: Can only press Left Pedal once when in Constant Speed or Decelerate States.\nUnable to move.");
                } else if(this.subState == "Decelerate") {
                    System.out.println("Transitioning from Decelerate State to Constant Speed State...");
                    this.subState = "Constant Speed";
                } else {
                    System.out.println("Transitioning from Constant Speed State to Decelerate State...");
                    this.subState = "Decelerate";
                }
                break;
            case 2:
                if(this.subState != "Decelerate" && this.subState != "Accelerate") {
                    System.out.println("Error: Can only press Left Pedal twice when in Accelerate or Decelerate States.\nUnable to move.");
                } else if(this.subState == "Decelerate") {
                    System.out.println("Transitioning from Decelerate State to Accelerate State...");
                    this.subState = "Accelerate";
                } else {
                    System.out.println("Transitioning from Accelerate State to Decelerate State...");
                    this.subState = "Decelerate";
                }
                break;
            case 3:
                if(this.subState != "Decelerate") {
                    System.out.println("Error: Can only press Left Pedal thrice when in Decelerate State.\nUnable to move.");
                } else {
                    System.out.println("Transitioning from Decelerate State to At Rest State...");
                    this.subState = null;
                    move = true;
                }
                break;
            default:
                System.out.println("Error: Must press Left Pedal once, twice, or thrice when in Move Backward State.\nUnable to move.");
                break;
        }
        return move;
    }

    /**
     * Simulates pressing the left pedal for a specified duration of time.
     *
     * @param numOfSecondsPressed The number of seconds the left pedal is pressed.
     */
    protected void voidPressLeftPedalForTime(int numOfSecondsPressed) {
        if(numOfSecondsPressed != 3) {
            System.out.println("Error: Can only press Left Pedal for 3 seconds when in Accelerate or Constant Speed States to move.\nUnable to move.");
            return;
        }
        if(this.subState != "Accelerate" && this.subState != "Constant Speed") {
            System.out.println("Error: Can only press Left Pedal for 3 seconds when in Accelerate or Constant Speed States.\nUnable to move.");
            return;
        }
        if(this.subState == "Accelerate") {
            System.out.println("Transitioning from Accelerate State to Constant Speed State...");
            this.subState = "Constant Speed";
            return;
        }
        System.out.println("Transitioning from Constant Speed State to Accelerate State...");
        this.subState = "Accelerate";
    }
}
