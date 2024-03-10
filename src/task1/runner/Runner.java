package task1.runner;

import task1.constant.IConstants;
import task1.parityCheck.ParityCheck;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите числа с консоли: ");
        ArrayList<Integer> numbers=new ArrayList<>();
        while(true){
            String str= scanner.nextLine();
            if (str.matches("[-+]?\\d+")){
                int number=Integer.parseInt(str);
                numbers.add(number);
            } else if (str.toLowerCase().contains(IConstants.stop)) {
                break;
            }else{
                System.out.println("Ввод неверен");
            }
        }
        scanner.close();
        ParityCheck.parityCheck(numbers);
    }
}
