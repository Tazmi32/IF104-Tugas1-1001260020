public class Buku0020 {
        private String judul;
        private String penulis;
        private double hargaBuku;

        public Buku0020(){
                judul = "Tanpa Judul";
                penulis = "Tanpa Penulis";
                hargaBuku = 12000;
        }

        public Buku0020 (String judul, String penulis,double hargaBuku) {
                setJudul(judul);
                setPenulis(penulis);
                setHargaBuku(hargaBuku);
        }

        public String getJudul() {
                return judul;
        }

        public void setJudul(String judul) {
                if (judul == null || judul.trim().isEmpty()) {
                        throw new IllegalArgumentException("Judul tidak boleh kosong");
                }
                this.judul = judul;

        }

        public String getPenulis() {
                return penulis;
        }

        public void setPenulis(String penulis) {
                if (penulis == null || penulis.trim().isEmpty()) {
                        throw new IllegalArgumentException("Penulis tidak boleh kosong");
                }
                this.penulis = penulis;

        }

        public double getHargaBuku() {
                return hargaBuku;
        }

        public void setHargaBuku(double hargaBuku) {
                if (hargaBuku < 0) {
                        throw new IllegalArgumentException("Harga buku harus lebih dari 0");
                }
                this.hargaBuku = hargaBuku;
        }

        public double hargaDiskon(double persen) {
                return hargaBuku - (hargaBuku * persen / 100);
        }
}
