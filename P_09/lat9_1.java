public class lat9_1 {
    String nim;
    String nama;
    String prodi;
    double ipk;

    public void setMhs(String nim, String nama, String prodi, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("NIM :" + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("Nilai IPK : " + ipk);
    }

    public static void main(String[] args) {
        lat9_1 mhs = new lat9_1();
        mhs.setMhs("145410012", "Nisa", "Informatika", 3.9);
        mhs.tampil();
    }
}
