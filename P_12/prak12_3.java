public class prak12_3 {
    public static long faktorial(long N) {
        long hasil = 1;
        for (long i = 1; i <= N; i++) {
            hasil *= i;
            System.out.println("Faktorial " + i + " : " + hasil);
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println("Faktorial 5: ");
        long result = faktorial(5);
        System.out.println("Hasil faktorial: " + result);
    }
}

