public class Main {
    public static void main(String[] args) {
        // Genre: GenreBuku (induk) dan GenreFiksi (turunan)
        GenreBuku pemrograman = new GenreBuku(1, "Pemrograman", "Buku mengenai pemrograman komputer.");
        GenreBuku novel = new GenreFiksi(2, "Novel", "Buku cerita fiksi.", "Drama");

        // Buku: Buku (induk, implements DapatDipinjam) dan Novel (turunan)
        Buku buku1 = new Buku(101, "Belajar Java OOP", "Andi", 2025, pemrograman);
        Buku buku2 = new Buku(102, "Pemrograman Dasar", "Budi", 2024, pemrograman);
        Buku buku3 = new Novel(103, "Senja di Kota", "Citra", 2023, (GenreFiksi) novel, 250);

        // Member: turunan Orang (abstract) dan implements Peminjam
        Member member1 = new MemberPremium(1, "Misael", "Karawang", 12);
        Member member2 = new Member(2, "Azis", "Bogor");
        Member member3 = new Member(3, "Zahra", "Bogor");
        Member member4 = new Member(4, "Faiza", "Bogor");
        Member member5 = new Member(5, "Intan", "Bogor");

        // Orang orang = new Orang(...);  // ERROR: Orang adalah abstract class

        System.out.println("=== DAFTAR GENRE ===");
        pemrograman.tampilkanGenre();
        System.out.println("-------------------");
        novel.tampilkanGenre();

        System.out.println("\n=== DAFTAR BUKU ===");
        buku1.tampilkanInfo();
        System.out.println("-------------------");
        buku2.tampilkanInfo();
        System.out.println("-------------------");
        buku3.tampilkanInfo();

        // Polimorfisme lewat abstract class Orang dan interface Peminjam
        System.out.println("\n=== DAFTAR ANGGOTA ===");
        Orang[] daftarAnggota = { member1, member2, member3, member4, member5 };
        for (Orang o : daftarAnggota) {
            String info = o.getId() + ". " + o.getNama() + " (" + o.getTipe() + ")";
            if (o instanceof Peminjam) {
                Peminjam p = (Peminjam) o;
                info += " - batas pinjam: " + p.getBatasPinjam() + " buku";
            }
            System.out.println(info);
        }

        System.out.println("\n=== PEMINJAMAN ===");
        member1.pinjamBuku(buku1);
        member1.pinjamBuku(buku3);
        member1.tampilkanData();

        System.out.println("\n=== MEMBER LAIN ===");
        member2.pinjamBuku(buku1);
        member3.pinjamBuku(buku2);
        member4.pinjamBuku(buku3);
        member5.pinjamBuku(buku1);

        System.out.println("\n=== PENGEMBALIAN ===");
        member1.kembalikanBuku(buku1);
        member2.pinjamBuku(buku1);

        System.out.println("\n=== DATA AKHIR MEMBER 1 ===");
        member1.tampilkanData();
        System.out.println("\n=== DATA AKHIR MEMBER 2 ===");
        member2.tampilkanData();

        // Polimorfisme lewat interface DapatDipinjam
        System.out.println("\n=== STATUS AKHIR BUKU ===");
        DapatDipinjam[] koleksi = { buku1, buku2, buku3 };
        for (DapatDipinjam item : koleksi) {
            System.out.println("- " + item.getJudul() + " : " + item.getStatus());
        }
    }
}
