// Subclass dari Buku untuk buku fiksi (novel)
public class Novel extends Buku {
    private int jumlahHalaman;

    public Novel(int idBuku, String judul, String penulis, int tahunTerbit,
                 GenreFiksi genre, int jumlahHalaman) {
        super(idBuku, judul, penulis, tahunTerbit, genre);
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getJumlahHalaman() { return jumlahHalaman; }

    @Override
    public String getJenisBuku() { return "Novel"; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Halaman     : " + jumlahHalaman);
    }
}
