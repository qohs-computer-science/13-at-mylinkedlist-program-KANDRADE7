//Katherine Andrade, 11/4/25, CP3 - Ms. Adams
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

    public boolean addFirst(Object newItem){
        ListNode apple = new ListNode(newItem, head); 
        head = apple;
        size++;
        return true;  
    }//end addFirst()

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
    
    public boolean addLast(Object obj){
        add(obj); 
        return true;
    }//end addLast() 

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
    
    public Object remove(int i){
        if(i<0 || i>=size)
            throw new IndexOutOfBoundsException();
        if(i==0)
            return removeFirst(); 

        ListNode temp= head;
        ListNode before = null;
        int index =0;

        while((temp!=null) && (temp.getNext()!=null) && (index < i)){
            before = temp;
            temp = temp.getNext();
            index++;
        }//end while loop
        
        Object storedVal = temp.getValue();
        //adjust connections
        before.setNext(temp.getNext());
        temp.setNext(null);
        size--;
        return storedVal;
    }//end remove()

    public Object removeFirst(){
        if(head == null)
            return null;
        else{
            Object hotChocolate = head.getValue();
            head = head.getNext();
            size--;
            return hotChocolate; 
        }//end else
    }//end removeFirst()

    public Object removeLast(){
        if(head == null)
            return null; 
        
        if(head.getNext() == null){
            Object gift = head.getValue();
            head = null;
            size--; 
            return gift;
        }//end if
 
        ListNode before = head;
        ListNode temp = head.getNext();
        while(temp.getNext()!= null){
            before = temp;
            temp=temp.getNext();
        }//end while loop

        Object pumpkin = temp.getValue();
        before.setNext(null);
        size--;
        return pumpkin;
    }//end removeLast()
} //end class