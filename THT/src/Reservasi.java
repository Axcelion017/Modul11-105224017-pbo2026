import java.util.ArrayList;
import java.util.List;
public class Reservasi {
    List<KeretaApi> daftarKereta = new ArrayList<>();
    private String nama, nik;
    private int jumlahTiket;


    public Reservasi() {
        daftarKereta = new ArrayList<>();
        // Inisialisasi data otomatis di memori sesuai requirement
        daftarKereta.add(new KeretaApi("K01", "Argo Bromo", "JKT - SBY", 50));
        daftarKereta.add(new KeretaApi("K02", "Parahyangan", "JKT - BDG", 15));
    }

    public void pesanTiket(String kodeKereta, String nama, String nik, int jumlahTiket) throws TiketHabisException, RuteTidakDitemukanException{
        
        if(nik.length() != 16 || !nik.matches("[0-9]+")){
            throw new DataPenumpangTidakValidException("Data NIK harus mengandung 16 angka.");
        }
        KeretaApi kereta = null;
        for (KeretaApi k : daftarKereta) {
            if (k.getKode().equalsIgnoreCase(kodeKereta)) {
                kereta = k;
                break;
            }
        }
        if (kereta == null) {
            throw new RuteTidakDitemukanException("Kereta dengan kode " + kodeKereta + " tidak ditemukan.");
        }

        if (kereta.getSisaKursi() < jumlahTiket) {
            throw new TiketHabisException(kereta.getNamaKereta(), kereta.getSisaKursi());
        }
        System.out.println("Tiket Berhasil Dipesan.");
        kereta.kurangiKursi(jumlahTiket);
        this.nama = nama;
        this.nik = nik;
        this.jumlahTiket = jumlahTiket;
    }
}
