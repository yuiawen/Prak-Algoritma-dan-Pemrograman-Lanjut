public class contohFungsi {
    // tanpa parameter
    public static void cetakGaris() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Fungsi");
        }
    }

    // dengan parameter
    public static void cetakGaris(int jumlah) {
        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Fungsi");
        }
    }

    public static void hitungLuasLingkaran(double jari) {
        double luas = 3.14 * jari * jari;
        System.out.println(luas);
    }

    public static void main(String[] args) {
        cetakGaris();
        // cetakGaris(100);
        hitungLuasLingkaran(10);
    }
}
