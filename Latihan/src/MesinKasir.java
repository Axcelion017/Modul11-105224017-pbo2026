public class MesinKasir {
    public void bayar(int totalBelanja, int uangDiberikan) throws UangKurangException {
        if (uangDiberikan < totalBelanja) {
            throw new UangKurangException("Maaf, uang yang Anda berikan kurang untuk membayar total belanja!");
        } else {
            int kembalian = uangDiberikan - totalBelanja;
            System.out.println("Pembayaran berhasil! Kembalian Anda: " + kembalian);
        }
    }

    public void cetakStruk(boolean statusPrinter) throws Exception {
        if (!statusPrinter) {
            throw new Exception("Printer error: Kertas struk habis!");
        } else {
            System.out.println("Struk berhasil dicetak!");
        }
    }
}
