public class TiketHabisException extends Exception{
    private String namaKereta;
    private int sisaKursi;
    public TiketHabisException(String namaKereta, int sisaKursi) {
        super("Tiket untuk kereta " + namaKereta + " habis. Sisa kursi yang tersedia: " + sisaKursi);
        this.namaKereta = namaKereta;
        this.sisaKursi = sisaKursi;
    }
}
