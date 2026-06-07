public class KeretaApi {
    private String kode, namaKereta, perjalanan;
    private int sisaKursi;

    KeretaApi(String kode, String namaKereta, String perjalanan, int kapasitas){
        this.kode = kode;
        this.namaKereta = namaKereta;
        this.perjalanan = perjalanan;
        this.sisaKursi = kapasitas;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public String getPerjalanan() {
        return perjalanan;
    }

    public int getSisaKursi(){
        return sisaKursi;
    }

    public void kurangiKursi(int jumlah) {
        this.sisaKursi -= jumlah;
    }
}
