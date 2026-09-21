// Class induk (superclass) untuk semua genre buku
public class GenreBuku {
    protected int idGenre;
    protected String namaGenre;
    protected String deskripsi;

    public GenreBuku(int idGenre, String namaGenre, String deskripsi) {
        this.idGenre = idGenre;
        this.namaGenre = namaGenre;
        this.deskripsi = deskripsi;
    }

    public int getIdGenre() { return idGenre; }
    public String getNamaGenre() { return namaGenre; }
    public String getDeskripsi() { return deskripsi; }

    public String getKategori() { return "Umum"; }

    public void tampilkanGenre() {
        System.out.println("Genre       : " + namaGenre);
        System.out.println("Deskripsi   : " + deskripsi);
    }
}
