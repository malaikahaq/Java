import java.util.ArrayList;
import java.util.Scanner;

public class Hello {
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
        for(int i=0; i< fruitNames.size(); i++){
            System.out.println(fruitNames.get(i));
        }
        System.out.println("enter the name of fruit you want to find: ");
        String search = scanner.nextLine();
        boolean found = fruitNames.contains(search);
        if (found){
            System.out.println(search + " was found!");
        }
        else{
            System.out.println("not found :(");
        }
    }
}