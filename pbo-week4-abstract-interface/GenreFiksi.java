// Subclass dari GenreBuku untuk genre bertipe fiksi
public class GenreFiksi extends GenreBuku {
    private String gayaCerita;

    public GenreFiksi(int idGenre, String namaGenre, String deskripsi, String gayaCerita) {
        super(idGenre, namaGenre, deskripsi);
        this.gayaCerita = gayaCerita;
    }

    public String getGayaCerita() { return gayaCerita; }

    @Override
    public String getKategori() { return "Fiksi"; }

    @Override
    public void tampilkanGenre() {
        super.tampilkanGenre();
        System.out.println("Kategori    : " + getKategori());
        System.out.println("Gaya Cerita : " + gayaCerita);
    }
}
