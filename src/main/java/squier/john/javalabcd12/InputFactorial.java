package squier.john.javalabcd12;

/**
 * Created by johnsquier on 1/12/17.
 */
public class InputFactorial {

    public int calculateFactorial(int input) {

        int factorial = 1;

        if ( input > 0 ) {

            for ( int i = 1; i <= input; i++ ) {
                factorial *= i;
            }

            return factorial;

        }
        else {
            return 0;
        }
    }
}
