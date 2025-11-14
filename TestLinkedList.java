//My tester file 
//Katherine Andrade, 11/13/14, period 6 cp3
public class TestLinkedList
{
  public static void main(String [] args)
  {

    MyLinkedList apple = new MyLinkedList(); 
    System.out.println("\nIs list empty? " + apple.isEmpty());
    System.out.println("List size: " + apple.size());
    
    //adds 10 values 
    apple.add("sugar cookie");
    apple.add("gift");
    apple.addLast("snow");
    apple.add("christmas tree");
    apple.add("wreath");
    apple.addFirst("star");
    apple.add("cocoa");
    apple.add("pumpkin");
    apple.addLast("music");
    apple.addFirst("pjs");
    apple.add("candy cane");

    System.out.println("\nOriginal list with 10 added values:");
    System.out.println(apple.toString());
    System.out.println("Is list empty? " + apple.isEmpty());
    System.out.println("List size: " + apple.size());

    //using set methods
    System.out.println("\n");
    Object oldValue = apple.set(6, "oz");
    Object oldValue2 = apple.set(0, "pink");
    Object oldValue3 = apple.set(10, "blueberry");

    System.out.println("Old values that were replaced: "  + oldValue + " (6), " + oldValue2 + " (0), " + oldValue3 + " (10)");
    

    System.out.println("\nNew list with new values after using set method");
    System.out.println(apple.toString());

    //get methods 
    System.out.print("Get method return values: ");
    System.out.print(apple.get(1)+ ", ");
    System.out.print(apple.get(0)+ ", ");
    System.out.println(apple.get(10));

    System.out.println("\nList BEFORE removal:");
    System.out.println(apple.toString());
    System.out.println("Is list empty? " + apple.isEmpty());
    System.out.println("List size: " + apple.size());

    //removing values
    Object removedA = apple.remove(4);
    Object removedB= apple.removeFirst();
    Object removedC = apple.removeLast();

    System.out.println("\nValues that were removed: " + removedA + ", " + removedB + ", " + removedC);

    System.out.println("\nList AFTER removal:");
    System.out.println(apple.toString());
    System.out.println("Is list empty? " + apple.isEmpty());
    System.out.println("List size: " + apple.size());
  } // end main
}//end TestLinkedList