public class App {
    public static void main(String[] args) throws Exception {
        AkunBank akun1 = new AkunBank("1234567890", 15000000);
        AkunBank akun2 = new AkunBank("0987654321", 3000000);

        try {
            // Mencoba tarik tunai melebihi saldo
            akun1.tarikTunai(16000000);
        } catch (SaldoTidakMencukupiException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try{
            // Mencoba transfer melebihi batas harian
            akun1.transfer(akun2, 9000000);//berhasil
            akun1.transfer(akun2, 2000000);//gagal karena melebihi batas harian
        } catch (SaldoTidakMencukupiException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (BatasTransferHarianException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("Sesi Transaksi ATM Anda telah diakhiri. Kartu dikeluarkan otomatis.");
        }
    }
}
