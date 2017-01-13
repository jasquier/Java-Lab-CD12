package squier.john.javalabcd12;

/**
 * Created by johnsquier on 1/12/17.
 */
public class InputSummer {

    public int sumUpToInput(int input) {

        int sum = 0;

        if (input > 0) {

            for (int i = 1; i <= input; i++) {
                sum += i;
            }

            return sum;

        } else if (input == 0) {

            return sum;

        } else {

            for (int i = 1; i >= input; i--) {
                sum += i;
            }

            return sum;

        }

    }
}
