package task1.parityCheck;

/*
 *class with parity method
 */

import java.util.ArrayList;

public class ParityCheck {

    public static void parityCheck(ArrayList<Integer>numbers){
        ArrayList<Integer>parityNumbers=new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                parityNumbers.add(number);
            }
        }
        System.out.println(parityNumbers);
    }
}
