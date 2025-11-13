//Katherine Andrade, 11/4/25, period 6
public class MyLinkedList
{
//fields
    private ListNode head;
    private int size; 

    public MyLinkedList(){
        head = null;
        size = 0; 
    }//end constructor

    public int size(){
        return size;
    }//end size()

    public boolean isEmpty(){
        if(size == 0)
            return true;
        return false;
    }// end isEmpty()

    public String toString() {
        int position = 0;
        ListNode temp = head;
        String end = "";

        while (temp != null){
            end += position + ": " + (temp.getValue()) + "\n"; 
            if(temp.getNext() == null){
                return end; 
            }//end if
            position++;
            temp = temp.getNext();
        }//end while
        return end; 
    }//end while
    

    //adds a ListNode element to the beginning of the LinkedList
    public boolean addFirst(Object newItem){
        ListNode apple = new ListNode(newItem, head); 
        head = apple;
        size++;
        return true;  
    }//end addFirst()


    //adds a ListNode element to the end of the LinkedList, always returns true.
    public boolean add(Object newItem){
        if(head==null){
            addFirst(newItem);
            return true;
        }//end if 
        //create temp that points to head first value
        ListNode temp = head; 
        while(temp.getNext() != null){
            temp=temp.getNext(); //moves pointer to next value
        }//end while
        ListNode coffee = new ListNode(newItem, null);
        temp.setNext(coffee);
        size++; 
        return true; 
    }//end add()
    
    //adds a ListNode element to the end of the LinkedList
    public boolean addLast(Object obj){
        add(obj); 
        return true;
    }//end addLast()
     

    // changes the information stored as the value of the ListNode element at the given position
    public Object set(int i, Object obj){
        int index =0;
        if(i<0 || i>=size)
            throw new IndexOutOfBoundsException();
        
        ListNode temp = head;
        while((temp != null) && (temp.getNext()!= null) && (index<i)){
            temp = temp.getNext();
            index++;
        }//end while loop

        Object sugarCookie = temp.getValue();
        temp.setValue(obj);
        return sugarCookie; 
    }//end set()


    //returns the information stored as the value of the ListNode element at a given position
    public Object get(int i){
        int index = 0;
        if((i<0) || (i>=size))
            throw new IndexOutOfBoundsException(); 
        else{
            ListNode temp = head;
            while((temp.getNext()!=null) && (index<i)){
                temp=temp.getNext(); 
                index++;
            }//end while loop
            return temp.getValue();
        }//end else
    }//end get()
    
} //end class
