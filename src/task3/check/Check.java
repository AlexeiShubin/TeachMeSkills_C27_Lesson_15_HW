package task3.check;
/**
class with a method for checking the number of collection elements
 */
public class Check {

    public static void check(short size){
        if (size<1||size>32000){
            System.out.println("Неверный размер коллекции!");
            System.exit(1);
        }

    }
}
