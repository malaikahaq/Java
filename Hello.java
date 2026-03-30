import java.util.ArrayList;
import java.util.Scanner;

public class Hello {

    public static void printList(ArrayList <String> list){
        for (String value: list){
            System.out.println(value);
        }
    }
    public static void main(String[] args){
        ArrayList<String> fruitNames = new ArrayList<>();
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("how many fruits do you want?");
                    int count = scanner.nextInt();
                    scanner.nextLine();
        for(int i=0; i< count; i++) {
            System.out.println("enter your fruit name: ");
            String fruitName = scanner.nextLine();
            fruitNames.add(fruitName);
        }
        printList(fruitNames);
    }
}