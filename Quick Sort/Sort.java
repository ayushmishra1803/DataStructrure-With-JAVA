class Sort {
    public static void main(String[] args) {
        int a[] = { 1, 5, 45, 13, 5, 4, 56, 41, 5, 1, 68, 1, 861, 5, 1 };
        QuickSort(a, 0, a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void QuickSort(int arry[], int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = Partition(arry, start, end);
        QuickSort(arry, start, pivotIndex);
        QuickSort(arry, pivotIndex + 1, end);
    }

    public static int Partition(int arry[],int start,int end)
    {
        int pivot =arry[start];
        int i=start;
        int j=end;
        while(i<j)
        {
            while(i<j && arry[--j]>=pivot);
            if(i<j)
            {
                arry[i]=arry[j];

            }
            while(i<j && arry[++i]<=pivot);
            if(i<j)
            {
                arry[j]=arry[i];
            }

        }
        arry[j]=pivot;
        return j;
     }
}