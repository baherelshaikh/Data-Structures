public class DynamicArray {

    private int arr []=new int [10];
    private int numberOfElemant;

    public void insert(int value)
    {
        if(numberOfElemant== arr.length)
        {
        int arr2[] =new int [arr.length*2];
        for(int i=0 ; i<numberOfElemant ; i++)
        arr2[i]=arr[i];
        arr = arr2 ;
        }
        arr[numberOfElemant++]=value;       
    }

    public void remove(int endex)
    {
        for(int i = endex ; i<numberOfElemant ; i++)
        {
            arr[i]=arr[i+1];
        }
        numberOfElemant--;

    }

    public int valueAt(int index)
    {
        return arr[index];
    }

    public int search (int value)
    {
        for(int i=0 ; i<numberOfElemant ;i++)
        {
            if(arr[i]== value)
            {
            return i ;
            }
        }  
        return -1 ;
    }

    public void sort ()
    {
        for(int i=0 ; i<numberOfElemant-1 ; i++)
        {
            for(int j =0 ; j< numberOfElemant-i-1 ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp ;
                }
            }

        }    
    }

    public void merge (int newArr[])
    {
        for(int i=0 ; i<newArr.length ; i++)
        insert(newArr[i]);
    }

    public void print ()
    {
        System.out.print("{ ");
        for(int i=0 ; i<numberOfElemant ; i++)
        { 
        System.out.print(arr[i]);
        if (i != numberOfElemant-1)System.out.print(", ");
        }
        System.out.println(" }");
    }



}
