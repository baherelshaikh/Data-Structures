public class sortedArray {
    int arr[];
    int numberOfElemant=0;
    public sortedArray(int size)
    {
        arr= new int [size];
    }

    public void insert (int value)
    {
        int i = numberOfElemant-1;
        while (i>=0 && arr[i]>value)
        {
            arr[i+1]=arr[i];
            i--;
        }
        arr[i+1]=value ;
        numberOfElemant++;
    }

    public int search(int value)
    {
        int l=0,h=numberOfElemant-1;
        while (l!=h)
        {
            int i=(l+h)/2;
            if(arr[i]== value) return i ;
            else if (arr[i]<value) l=i+1;
            else h=i-1;
        }
        if(arr[l]==value)
        return l;
        return-1;
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
