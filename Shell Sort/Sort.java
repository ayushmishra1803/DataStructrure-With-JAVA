class Sort {
    public static void main(String[] args) {
        int a[] = { 5, 7, 21, 564, 6, 46, 548, 4, 64, 68 };
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                int j = i;
                int NewElemet = a[i];
                while (j >= gap && a[j - gap] > NewElemet) {
                    a[j] = a[j - gap];
                    j -= gap;
                }
                a[j] = NewElemet;

            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}