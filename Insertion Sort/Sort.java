class Sort
{
    public static void main(String[] args) {
        int a[]={5,42,16,545,5,21,54,584};
        for(int unsorted=1;unsorted<a.length;unsorted++)
        {
            int NewElement=a[unsorted];
            int i;
            for(i=unsorted;i>0 && a[i-1]>NewElement;i--)
            {
                a[i]=a[i-1];
            }
            a[i]=NewElement;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}