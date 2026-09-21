// Subclass dari Member dengan batas pinjam lebih banyak
public class MemberPremium extends Member {
    private int masaBerlakuBulan;

    public MemberPremium(int idMember, String nama, String alamat, int masaBerlakuBulan) {
        super(idMember, nama, alamat);
        this.masaBerlakuBulan = masaBerlakuBulan;
    }

    public int getMasaBerlakuBulan() { return masaBerlakuBulan; }

    @Override
    public String getTipe() { return "Member Premium"; }

    @Override
    public int getBatasPinjam() { return 5; }

    @Override
    protected void tampilkanInfoTambahan() {
        System.out.println("Masa Aktif: " + masaBerlakuBulan + " bulan");
    }
}
