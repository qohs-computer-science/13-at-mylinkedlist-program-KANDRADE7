//My tester file 
public class MyLLTester
{
  public static void main(String [] args)
  {
    //testing part 1!
    MyLinkedList apple = new MyLinkedList(); 
    System.out.println(apple.isEmpty());
    apple.addFirst(4);
    System.out.println(apple.isEmpty()); 
    System.out.println(apple.toString());
    apple.add("Hello");
    System.out.println(apple.toString());
    apple.addFirst("Christmas");
    System.out.println(apple.toString());
    apple.addLast("Happy");
    System.out.println(apple.toString());
    System.out.println(apple.isEmpty());
    System.out.println(apple.size());

    //testing part 2!
      //testing get method
    System.out.println(apple.get(0));
    System.out.println(apple.get(2));
    System.out.println(apple.get(3));
      //testing set method
    System.out.println(apple.toString());
    System.out.println("Old value at index 0: " + apple.set(0,"gingerbread"));
    System.out.println("Old value at index 2: " +apple.set(2,"ice skating"));
    System.out.println("Old value at index 3: " +apple.set(3, "snowman"));
    System.out.println(apple.toString());


    apple.removeFirst();
    System.out.println(apple.toString());

    apple.remove(1);
    System.out.println(apple.toString());
    System.out.println("work on testing part 3 and tester file");
  } // end main
}//end 
  