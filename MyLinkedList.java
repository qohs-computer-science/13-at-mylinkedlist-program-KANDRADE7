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

    /* 
     * public String toString(){
        //to be added to later...
    }//end toString()
     * 
     */
    
    public boolean addFirst(Object newItem){
        ListNode front = (ListNode) newItem;
        front.setNext(head);
        head = front; 
        size++;
        return true; 
    }//end addFirst()


    
     public boolean add(Object newItem){
        ListNode temp = head; 
        if(temp.getValue()==null){
            addFirst(newItem);
            return true;
        }
        while(temp.getValue() != null){
            if(temp.getNext()==null){
                temp.setValue(newItem);
                size++; 
                return true; 
            }//end if
            else
                temp = temp.getNext();
        }//end while loop
    }//end add()
    
    
} //end class
