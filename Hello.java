import java.util.ArrayList;
import java.util.Scanner;

public class Hello {
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for (int num : numbers){
            if (num > lowerLimit && num < upperLimit){
                System.out.println(num);
            }
        } 
    }
    public static int sum(ArrayList<Integer> numbers){
        int sumOfNums = 0;
        for (int num: numbers){
            sumOfNums += num;
        }
                    return sumOfNums;
    }
    public static void removeLast(ArrayList<Integer> numbers){
        if (numbers.size() == 0){
            return;
        }
        else {
            numbers.remove(numbers.size()-1);
        }
        for (int num : numbers){
            System.out.println(num);
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        removeLast(numbers);
    }
}