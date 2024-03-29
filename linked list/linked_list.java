
public class linked_list{

    private class Node {
        int data;
        Node next=null;
    
        Node (int value)
        {
            data = value ;
        }
    }
    private Node head= null;
    private Node tail; 
    private int size;

    public void addFirst(int value)
    {
        Node newnode = new Node(value); 

        if(isempty())
        head = tail = newnode;
        else{
        newnode.next=head ;
        head = newnode ;
        }
        size++;
    }

    public void addLast(int value)
    {
        Node newnode = new Node(value); 

        if(head==null)
            head = tail = newnode;
        else
        {
            tail.next=newnode;
            tail=newnode;
        }
        size++;
    }

    public void addAt(int value , int index)
    {
        Node newnode = new Node(value) ;
        if(index==0) addFirst(value);
        else if(index==size) addLast(value);
        else 
        {
            Node current = head;
             
            while (current.next!=null)
            {
                if(index==1)
                {
                    newnode.next=current.next;
                    current.next=newnode;
                    size++;
                    break ;
                }

                current = current.next;
                index--;
            }
        }    
        
    }

    private void delet()
    {
        if(isempty()) System.out.println("linked list is already empty !");
        else if (head.next==null)
        {
        head = tail = null ;
        size =0;
        }

    }

    public void deletFirst()
    {
        delet();
        if(head!=null&&head.next!=null)
        { 
        head= head.next ;
        size--;
        }
    }

    public void deletLast()
    {
        delet();
        if(head!=null&&head.next!=null)
        {
            Node current = head ;
            while(current.next.next!=tail)
            {
                current=current.next;
            }
            current.next.next=null;
            tail = current.next; //an important step 
            size--;

        }

    }
    
    public void deletAt(int index)
    {
        if(isempty()) System.out.println("linked list is already empty !");
        else if (index <size&&index>-1)
        {
            if (head!=null && head.next!=null)
            {
                if(index==0) deletFirst();
                else if (index==size-1) deletLast();
                else 
                {
                    Node current = head ;
                    while(current.next!=null)
                    { 
                        if(index ==1)
                        {
                        current.next= current.next.next;
                        size--;
                        break ;
                        }
                        current=current.next;
                        index--;
                    }
                
                }
            }
        }
        else System.out.println("The index is not existed !");
    }

    public int search (int value)
    {
        Node current = head ;
        int i=0;
        while(current!=null)
        {
            if(current.data==value) return i;
            current=current.next;
            i++;
        }
        return -1;
    }
    
    public int travers(int index)
    {
        Node current = head ;
        while(current!=null)
        {
            if(index==0)
            {
            return current.data;
            }
            current=current.next;
            index--;

        }
        return -1 ;
    }
    public void sort()
    {
        Node i = head ;
        while(i!=null)
        {
            Node j = i.next ;
            while(j!=null)
            {
                if(i.data>j.data) swap(i,j);
                j=j.next;
            }
            i=i.next;
        }
    }

    public void merge(linked_list list)
    {
        Node current = list.head;
        while(current!=null)
        {
            addLast(current.data);
            current=current.next;
        }
    }
    private void swap(Node i , Node j)
    {
        int temp = i.data;
        i.data=j.data;
        j.data=temp;
    }
    public boolean isempty()
    {
        return (head == null);
    }

    public void print ()
    {
        Node current = head ;
        while (current != null)
        {
        System.out.print(current.data+ " ");
        current = current.next ;
        }
        System.out.println(" \n");
    } 
}