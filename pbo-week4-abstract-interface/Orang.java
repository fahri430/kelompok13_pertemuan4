// Abstract tidak bisa di-instansiasi langsung: new Orang() akan error
public abstract class Orang {
    protected int id;
    protected String nama;
    protected String alamat;

    public Orang(int id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }

    // Method abstract: WAJIB diimplementasikan oleh subclass
    public abstract String getTipe();
    public abstract void tampilkanData();

    // Method konkret: dipakai bersama oleh semua subclass
    protected void tampilkanIdentitas() {
        System.out.println("ID        : " + id);
        System.out.println("Nama      : " + nama);
        System.out.println("Alamat    : " + alamat);
    }
}
