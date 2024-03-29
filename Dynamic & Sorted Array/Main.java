import java.util.Scanner;

public class Main {

    public static void main (String[] args)
    {
        System.out.println("Please inter 1 for create a Dynamic array and 2 for create a sorted array ...");
        Scanner in =new Scanner(System.in);
        int input= in.nextInt();

        if(input==1)
        {
            DynamicArray arr1 = new DynamicArray();
            System.out.println("Please inter the number of element that you want to add ...");
            int NO =in.nextInt();
            int element;
            for(int i=0 ; i<NO ;i++)
            {
                System.out.println("Please inter the element NO."+(i+1)+" ...");
                element = in.nextInt();
                arr1.insert(element);
            }
            
            arr1.sort();
            arr1.print();
        }
        else if(input == 2)
        {

            System.out.println("Please inter the size of array that you want ...");
            int size=in.nextInt();
            sortedArray arr3 = new sortedArray(size);
            System.out.println("Please inter the number of element that you want to add ...");
            int NO =in.nextInt();
            int element;
            for(int i=0 ; i<NO ;i++)
            {
                System.out.println("Please inter the element NO."+(i+1)+" ...");
                element = in.nextInt();
                arr3.insert(element);
            }
            arr3.print();
            System.out.println( arr3.search(8));
        }
        else 
        System.out.println("The number is not correct !");
    }
} 