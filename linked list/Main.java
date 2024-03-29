public class Main {

    public static void main(String [] args)
    {
        linked_list lis = new linked_list();
        lis.addFirst(1);
        lis.addFirst(5);
        lis.addFirst(7);
        lis.addFirst(9);
        lis.addFirst(2);
        lis.addLast(88);
        lis.addAt(15, 3);
        lis.print();

        linked_list list = new linked_list();
        lis.addFirst(22);
        lis.addFirst(33);
        lis.addFirst(44);
        lis.addFirst(55);
        lis.addFirst(66);
        lis.addLast(77);
    
        lis.merge(list);
        list.merge(lis);
        
      
       lis.sort();
       lis.print();
       list.sort();
       list.print();
        
        
    }
    
}
