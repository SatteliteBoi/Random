class ForFibonacci{
        public static void main (String[] args) {
            int k = 0;
            int m = 1;
            System.out.print(k);
            int p = 0;
            for(int i = 1; i<=10;i++) {
                k = m;
                m = p;
                p = m + k;
                System.out.print(", " + p);
            }
    }
}