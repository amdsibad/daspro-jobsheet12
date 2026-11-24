public class PengunjungCafe02 {
    static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("Daftar Nama Pengunjung:");
    for (String nama : namaPengunjung) {
        System.out.println("- " + nama);
        }
    }

    static int hitungTotalBelanja(int... harga) {
        int total = 0;
        for (int h : harga) {
            total += h;
        }
        return total;
    }

    public static void main(String[] args) {
        String[] tamu = {"Ali", "Budi", "Citra"};
        daftarPengunjung(tamu);

        System.out.println("Total belanja (1 argumen): " + hitungTotalBelanja(15000));
        System.out.println("Total belanja (3 argumen): " + hitungTotalBelanja(15000, 20000, 22000));
        System.out.println("Total belanja (5 argumen): " + hitungTotalBelanja(15000, 20000, 22000, 12000, 10000));
    
    }
}
