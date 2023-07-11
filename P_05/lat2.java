public class lat2 {
        public static void main(String[] args) {
                String entry[][][] = {
                                { { "Vanslezer", "100411052", "Surabaya" }, { "Echa", "100411025", "Jakarta" },
                                                { "Masayu", "100411024", "Malang" } },
                                { { "Alex", "100411053", "Yogyakarta" }, { "Nakaga", "100411054", "Bandung" },
                                                { "Yuki", "100411055", "Semarang" } },
                                { { "Mira", "100411056", "Palembang" }, { "Misa", "100411057", "Bogor" },
                                                { "Kamada", "100411058", "Makassar" } } };
                for (int i = 0; i < entry.length; i++) {
                        for (int j = 0; j < entry[0].length; j++) {
                                System.out.println("Nama : " + entry[i][j][0]);
                                System.out.println("Nim : " + entry[i][j][1]);
                                System.out.println("Alamat : " + entry[i][j][2]);

                                System.out.println("-------------------------");
                        }
                        System.out.println();
                }
        }
}
