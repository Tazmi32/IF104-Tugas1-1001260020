public class Main {
    public static void main (String [] args) {
        Perpustakaan perpus = new Perpustakaan("Perpustakaan Kampus ITTS");

        Buku0020 b1 = new Buku0020("Sang Alkemis", "Paulo Coelho", 12000);
        Buku0020 b2 = new Buku0020("Pulang", "Tere Liye", 12000);

        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);

        perpus.tampilkanDaftar();
        System.out.println("Total harga: " + perpus.hitungTotalHarga());
        System.out.println("Harga " + b1.getJudul() + " setelah diskon 10%: "
                + b1.hargaDiskon(10));

    }
}