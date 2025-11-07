//Katherine Andrade, 11/4/25, period 6
public class MyLinkedList
{
//fields
    private ListNode head;
    private int size; 
    public MyLinkedList(){
        head = new ListNode (null,null);
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

    //fix toString so it prints multiple indices and prints the actual value 
    public String toString() {
        int position = 0;
        ListNode temp = new ListNode((head.getValue()), head.getNext());
        String end = "";
        while (temp != null){
            end = position + ": " + temp; 
            if(temp.getNext() == null){
                return end; 
            }//end if
            position++;
            temp = temp.getNext();
        }//end while
        return end; 
    }//end while
    
    
    
    
    public boolean addFirst(Object newItem){
        if(head == null){
            head.setValue(newItem);
            size++;
            return true;
        }//end if
        else {
            ListNode updated = new ListNode (newItem, head); 
            head.setValue(updated); 
            size++;
            return true;  
        }//end else
    }//end addFirst()


    /*
     * public boolean add(Object newItem){
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
    return true; 
    }//end add()
     */
     
    
    
} //end class
