
class Bubblesort {
    public static void main(String[] args) {
        int a[] = new int[6];
        a[0] = 54;
        a[1] = 98;
        a[2] = 578;
        a[3] = 577;
        a[4] = 45;
        a[5] = 98;
        System.out.println("Array we Have is ");
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " , ");

        }
        System.out.println(" \n Array after sorting is ");
        int temp=0;
        for (int i = 0; i < a.length; i++) {
            for(int j=0;j<a.length-i-1;j++)
            {
                
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" , ");
        }

    }

}