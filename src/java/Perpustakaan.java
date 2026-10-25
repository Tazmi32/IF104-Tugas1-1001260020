import  java.util.ArrayList;

public class Perpustakaan {
    private String perpustakaanITTS;
    private ArrayList<Buku0020> daftarBuku;

    public Perpustakaan(String perpustakaanITTS) {
        setPerpustakaanITTS(perpustakaanITTS);
        this.daftarBuku = new ArrayList<>();

    }

    public String getPerpustakaanITTS() {
        return perpustakaanITTS;
    }

    public void setPerpustakaanITTS(String perpustakaanITTS) {
        if (perpustakaanITTS == null || perpustakaanITTS.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama perpustakaan tidak boleh kosong");
        }
        this.perpustakaanITTS = perpustakaanITTS;
    }

    public void tambahBuku(Buku0020 b) {
        daftarBuku.add(b) ;
    }

    public double hitungTotalHarga() {
        double total = 0;
        for (Buku0020 b : daftarBuku) {
            total += b.getHargaBuku();
        }
        return total;
    }

    public void tampilkanDaftar () {
        System.out.println("=== " + perpustakaanITTS + "=== ");
        for (Buku0020 b : daftarBuku) {
            System.out.println(b.getJudul() + " | " + b.getPenulis()
                    + " | " + b.getHargaBuku());
        }
    }
}