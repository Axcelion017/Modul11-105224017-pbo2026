public class SaldoTidakMencukupiException extends Exception {
    private double kurang;
    public SaldoTidakMencukupiException(String message, double kurang) {
        super(message);
        this.kurang = kurang;
    }

    public double getKurang() {
        return kurang;
    }
}
