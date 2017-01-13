package squier.john.javalabcd12;

/**
 * Created by johnsquier on 1/12/17.
 */
public class Main {

    public static void main(String[] args) {

        InputOutput inputOutput = new InputOutput();
        InputSummer inputSummer = new InputSummer();
        InputFactorial inputFactorial = new InputFactorial();

        int input = inputOutput.getIntInput(
                "Enter the number you wish to operate on: ");

        boolean sumTproductF = inputOutput.getSumTProductF(
                "Do you wish to SUM or MULTIPLY?:");


    }
}
