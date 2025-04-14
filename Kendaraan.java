public class Kendaraan {
    // Atribut
    int nomer;
    String nama;
    String merek;
    int tahun;
    int harga;

    // Constructor
    public Kendaraan(int nomer, String nama, String merek, int tahun, int harga) {
        this.nomer = nomer;
        this.nama = nama;
        this.merek = merek;
        this.tahun = tahun;
        this.harga = harga;
    }

    // Method untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Kendaraan " + nomer);
        System.out.println("Nama Kendaraan  : " + nama);
        System.out.println("Merek           : " + merek);
        System.out.println("Tahun           : " + tahun);
        System.out.println("Harga           : " + harga);
    }

    // Method untuk memperbarui harga kendaraan
    public void updateHarga(int hargaBaru) {
        harga = hargaBaru;
        System.out.println("Harga kendaraan diperbarui menjadi: " + harga);
    }

    public static void main(String[] args) {
        // Membuat objek menggunakan konstruktor
        Kendaraan mobil1 = new Kendaraan(1,"Avanza", "Toyota", 2022, 125000000);
        Kendaraan mobil2 = new Kendaraan(2, "Civic", "Honda", 2021, 450000000);

       
        mobil1.tampilkanInfo();
        mobil1.updateHarga(135000000);

        System.out.println();

        mobil2.tampilkanInfo();
        mobil2.updateHarga(460000000);
    }
}
