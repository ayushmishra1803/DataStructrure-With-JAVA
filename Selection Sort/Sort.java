class Sort
{
    public static void main(String[] args) {
        int a[]={2454,23,165,45,313,45,644,234,5};
        for(int unsorted=a.length-1;unsorted>0;unsorted--)
        {
            int largest=0;
            for(int i=1;i<=unsorted;i++)
            {
                if(a[largest]<a[i])
                {
                    largest=i;
                }
            }
            Swap(a, largest,unsorted);
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void Swap(int []array ,int i,int j)
    {
        if(i==j)
        {
            return;
        }
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}