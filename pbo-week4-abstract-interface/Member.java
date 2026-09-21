import java.util.ArrayList;

// Turunan dari Orang (abstract class) dan implementasi Peminjam (interface)
public class Member extends Orang implements Peminjam {
    protected ArrayList<Buku> bukuDipinjam;

    public Member(int idMember, String nama, String alamat) {
        super(idMember, nama, alamat);
        bukuDipinjam = new ArrayList<>();
    }

    public int getIdMember() { return id; }

    // Implementasi method abstract dari Orang
    @Override
    public String getTipe() { return "Member Biasa"; }

    // Implementasi method dari interface Peminjam
    @Override
    public int getBatasPinjam() { return 2; }

    @Override
    public void pinjamBuku(Buku buku) {
        if (bukuDipinjam.size() >= getBatasPinjam()) {
            System.out.println(nama + " sudah mencapai batas peminjaman (" + getBatasPinjam() + " buku).");
        } else if (buku.pinjam()) {
            bukuDipinjam.add(buku);
            System.out.println(nama + " berhasil meminjam buku: " + buku.getJudul());
        } else {
            System.out.println("Buku sedang dipinjam.");
        }
    }

    @Override
    public void kembalikanBuku(Buku buku) {
        if (bukuDipinjam.contains(buku)) {
            buku.kembalikan();
            bukuDipinjam.remove(buku);
            System.out.println(nama + " mengembalikan buku: " + buku.getJudul());
        } else {
            System.out.println("Buku tersebut tidak sedang dipinjam oleh " + nama);
        }
    }

    // Hook method: subclass dapat menambahkan informasi khusus
    protected void tampilkanInfoTambahan() { }

    // Implementasi method abstract dari Orang
    @Override
    public void tampilkanData() {
        System.out.println("\n=== DATA MEMBER ===");
        tampilkanIdentitas();
        System.out.println("Tipe      : " + getTipe());
        System.out.println("Batas     : " + getBatasPinjam() + " buku");
        tampilkanInfoTambahan();
        System.out.println("\nBuku yang dipinjam:");
        if (bukuDipinjam.isEmpty()) {
            System.out.println("Tidak ada buku.");
        } else {
            for (Buku buku : bukuDipinjam) {
                System.out.println("- " + buku.getJudul());
            }
        }
    }
}
