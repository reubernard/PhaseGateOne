import java.util.Scanner;
import java.util.ArrayList;
public class GroceryManagerApp{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
ArrayList<String> groceryList = new ArrayList<>();
String display = """

    Welcome to Berny Grocery App
    
    select what you would like to do today.

    1.  Add item(s) to the list
    2.  Remove item(s) from the list
    3.  Show all items in the grocery list
    4.  exit


""";
System.out.print(display);
while (true){
     
    int choice = input.nextInt();
    input.nextLine();


    switch (choice) {

        case 1:
            System.out.print("Enter all items to add them to the list: ");
            System.out.println("Eg. bread, orange, apple, beans, etc");
            String addItem = input.nextLine();
            groceryList.add(addItem);
            System.out.println(groceryList);
            System.out.println(addItem + " added to the grocery list.");
            System.out.println("enter 3 to view your grocery list");
            break;

        case 2:
            System.out.print("Enter item to remove: ");
            String removeItem = input.nextLine();
            if (groceryList.remove(removeItem)) {
                System.out.println(removeItem + " removed from the grocery list.");
            } else {
                System.out.println("Item not found.");
            }break;
          

        case 3:
             if (groceryList.isEmpty()) {
                System.out.println("Your grocery list is empty.");
            } else {
                System.out.println("Your Grocery List:");
                System.out.println(groceryList);
                }
            break;


        case 4:
            System.out.print("Goodbye from Berny Grocery App");
            return;


}

}
}
}

