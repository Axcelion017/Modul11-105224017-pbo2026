import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int[] harga = new int[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++){
            try {
                    System.out.print("Masukkan harga barang ke-" + (i+1) + ": ");
                    harga[i] = input.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Error: Input harga harus berupa angka!");
                input.nextLine();
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Kapasistas memori sudah penuh!");
                input.nextLine();
            }
        }
        input.close();

        Pelanggan p1 = new Pelanggan("Michael", 16);
        try{
            p1.tambahMember(p1);
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Soal 2 selesai.");
        }

        try{
            p1.pesanKopi(10);
        }catch(KopiHabisException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Soal 3 selesai.");
        }

        MesinKasir kasir = new MesinKasir();
        try{
            kasir.bayar(50000, 30000);
        }catch (UangKurangException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Soal 4 selesai.");
        }

        try{
            kasir.cetakStruk(false);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Terima kasih telah berkunjung ke Cafe Java Bean. Program kasir ditutup.");
        }

    }   
}