public class SparePart {
    // Atribut
    int nomer;
    String nama;
    String kode;
    int harga;
    int stok;

    // Constructor
    public SparePart(int nomer, String nama, String kode, int harga, int stok) {
        this.nomer = nomer;
        this.nama = nama;
        this.kode = kode;
        this.harga = harga;
        this.stok = stok;
    }

    // Method untuk menampilkan informasi spare part
    public void tampilkanInfo() {
        System.out.println("SparePart " + nomer);
        System.out.println("Nama Spare Part: " + nama);
        System.out.println("Kode: " + kode);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }

    // Method untuk memperbarui stok spare part
    public void updateStok(int stokBaru) {
        stok = stokBaru;
        System.out.println("Stok diperbarui menjadi: " + stok);
    }

    public static void main(String[] args) {
        // Membuat objek menggunakan konstruktor
        SparePart sp1 = new SparePart(1, "kopling", "193709e81039", 3000000, 5);
        SparePart sp2 = new SparePart(2, "kampas rem", "28374br57382", 1500000, 10);

        
        sp1.tampilkanInfo();
        sp1.updateStok(10);

        System.out.println();
        
        sp2.tampilkanInfo();
        sp2.updateStok(12);
    }
}
