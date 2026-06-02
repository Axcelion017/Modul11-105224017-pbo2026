
public class Pelanggan {
    private String nama;
    private int umur;
    private int stokKopi = 5;

    public Pelanggan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public int getStokKopi() {
        return stokKopi;
    }

    public void pesanKopi(int jumlahPesanan){
        if (stokKopi < jumlahPesanan) {
            throw new KopiHabisException("Maaf, stok kopi tidak mencukupi untuk pesanan Anda!");
        } else {
            stokKopi -= jumlahPesanan;
            System.out.println("Pesanan kopi berhasil! Sisa stok kopi: " + stokKopi);
        }
    }

    public void tambahMember(Pelanggan pelanggan) throws IllegalArgumentException {
        if (pelanggan.getUmur() < 18) {
            throw new IllegalArgumentException("Maaf, umur Anda belum mencukupi untuk menjadi member VIP");
        } else {
            System.out.println("Member " + pelanggan.getNama() + " berhasil ditambahkan!");
        }
    }
}