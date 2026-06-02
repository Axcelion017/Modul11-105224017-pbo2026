public class AkunBank {
    private String nomorRekening;
    private double saldo, totalTransferHariIni;

    public AkunBank(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
        this.totalTransferHariIni = 0;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getTotalTransferHariIni() {
        return totalTransferHariIni;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void tambahSaldo(double nominal) {
        setSaldo(getSaldo() + nominal);
    }

    public void tarikTunai(double nominal) throws SaldoTidakMencukupiException {
        if (nominal > saldo) {
            throw new SaldoTidakMencukupiException("Saldo tidak mencukupi untuk penarikan.", nominal - saldo);
        }else{
            setSaldo(getSaldo() - nominal);
            System.out.println("Penarikan sebesar Rp" + nominal + " berhasil dari " + nomorRekening);
        }
    }

    public void transfer(AkunBank tujuan, double nominal) throws SaldoTidakMencukupiException, BatasTransferHarianException {
        if (nominal > saldo) {
            throw new SaldoTidakMencukupiException("Saldo tidak mencukupi untuk transfer.", nominal - saldo);
        } else if (totalTransferHariIni + nominal > 10000000) {
            throw new BatasTransferHarianException("Batas transfer harian telah terlampaui.");
        }else{
            this.saldo -= nominal;
            tujuan.tambahSaldo(nominal);
            this.totalTransferHariIni += nominal;
            System.out.println("Transfer sebesar Rp" + nominal + " berhasil dari " + nomorRekening + " ke " + tujuan.getNomorRekening());
       }
    }
}
