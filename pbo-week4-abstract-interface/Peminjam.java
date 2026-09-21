// Interface kontrak untuk pihak yang meminjam buku
public interface Peminjam {
    int getBatasPinjam();
    void pinjamBuku(Buku buku);
    void kembalikanBuku(Buku buku);
}
