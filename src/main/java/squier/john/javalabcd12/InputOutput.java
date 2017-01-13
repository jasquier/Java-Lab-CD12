package squier.john.javalabcd12;

import java.util.Scanner;
/**
 * Created by johnsquier on 1/13/17.
 */
public class InputOutput {

    private int input = 0;
    private String sumOrProduct = null;
    private boolean sumTproductF = false;
    private Scanner scanner = new Scanner(System.in);

    public int getIntInput(String message) {
        System.out.print(message);
        input = scanner.nextInt();
        return input;
    }

    public boolean getSumTProductF(String message) {
        System.out.print(message);
        sumOrProduct = scanner.next();

        if ( sumOrProduct.equalsIgnoreCase("add") ) {
            sumTproductF = true;
            return sumTproductF;
        }
        else {
            sumTproductF = false;
            return sumTproductF;
        }
    }

    public void displayResult(int result) {
        System.out.printf("\nRESULT = %d\n", result);
    }
}
