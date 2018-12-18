package controller;

public class CharacterController {

    public static int diceRoll(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
