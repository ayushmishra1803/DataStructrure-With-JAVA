class Sort {
    public static void main(String[] args) {
        int a[] = { 2, 4, 5, 6, 8, 4, 9, 5, 1, 2, 3, 5, 6 };


        count(a, 1, 9);


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    } 
    public static void count(int arry[],int min,int max )
    {
        int [] countarry=new int [(max-min)+1];
        for(int i=0;i<arry.length;i++)
        {
            countarry[arry[i]-min]++;
        }
        int j=0;
        for(int i=min;i<=max;i++)
        {
            while(countarry[i-min]>0)
            {
                arry[j++]=i;
                countarry[i-min]--;
            }
        }
    }
}