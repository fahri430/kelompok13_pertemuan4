// Interface kontrak untuk barang perpustakaan yang bisa dipinjam
public interface DapatDipinjam {
    String getJudul();
    String getStatus();
    boolean pinjam();
    void kembalikan();
}
