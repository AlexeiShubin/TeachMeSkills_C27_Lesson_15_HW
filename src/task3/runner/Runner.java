package task3.runner;

import task3.check.Check;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Runner  {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.print("Введите количество элементов коллекции: ");
        try {
            short size = scanner.nextShort();
            scanner.close();
            Check.check(size);
            int number;
            ArrayList<Integer> numbers = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                number = random.nextInt(0, 1000);
                numbers.add(number);
            }
            int sum = 0;
            for (Integer integer : numbers) {
                sum += integer;
            }
            double x = (double) sum / numbers.size();
            System.out.println(x);
        }catch (InputMismatchException exception){
            System.out.println("Неверные символы");
        }
    }
}
