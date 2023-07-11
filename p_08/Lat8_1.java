public class Lat8_1 {
    // variable data pribadi
    String nik;
    String name;
    String gender;
    int age;
    String address;

    // Konstruktor untuk menginisialisasi data pribadi
    public Lat8_1(String nik, String name, String gender, int age, String address) {
        this.nik = nik;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    // Metode untuk menampilkan data pribadi
    public void display() {
        System.out.println("NIK\t\t: " + nik);
        System.out.println("Nama\t\t: " + name);
        System.out.println("Jenis Kelamin\t: " + gender);
        System.out.println("Umur\t\t: " + age);
        System.out.println("Alamat\t\t: " + address);

    }

    public static void main(String[] args) {
        // Membuat objek Lat8_1 dengan data pribadi Anda
        Lat8_1 data = new Lat8_1("1234567890", "John Doe", "Laki-laki", 30, "Jalan Raya No. 123");
        // Memanggil metode displayData() untuk menampilkan data pribadi
        data.display();
    }
}
