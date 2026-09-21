// Class induk (superclass) untuk semua jenis buku
public class Buku implements DapatDipinjam {
    protected int idBuku;
    protected String judul;
    protected String penulis;
    protected int tahunTerbit;
    protected String status;
    protected GenreBuku genre;

    public Buku(int idBuku, String judul, String penulis, int tahunTerbit, GenreBuku genre) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.genre = genre;
        this.status = "Tersedia";
    }

    public int getIdBuku() { return idBuku; }
    @Override public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public int getTahunTerbit() { return tahunTerbit; }
    @Override public String getStatus() { return status; }
    public GenreBuku getGenre() { return genre; }

    public String getJenisBuku() { return "Buku Umum"; }

    @Override
    public boolean pinjam() {
        if (status.equals("Tersedia")) {
            status = "Dipinjam";
            return true;
        }
        return false;
    }

    @Override
    public void kembalikan() { status = "Tersedia"; }

    public void tampilkanInfo() {
        System.out.println("ID Buku     : " + idBuku);
        System.out.println("Judul       : " + judul);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Tahun       : " + tahunTerbit);
        System.out.println("Genre       : " + genre.getNamaGenre());
        System.out.println("Jenis       : " + getJenisBuku());
        System.out.println("Status      : " + status);
    }
}
