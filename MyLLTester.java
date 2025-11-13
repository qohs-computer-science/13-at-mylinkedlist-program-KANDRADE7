//My tester file 
public class MyLLTester
{
  public static void main(String [] args)
  {
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

  } // end main
}//end 
  