import java.util.Scanner;
import java.util.InputMismatchException;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int num1, num2, hasil;

        try{
            System.out.print("Masukan angka pertama: ");
            num1  = input.nextInt();
            System.out.print("Masukan angka kedua: ");
            num2 = input.nextInt();
            hasil = num1 / num2;
        }catch (ArithmeticException e) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan. Error: " + e.getMessage());
        }catch(InputMismatchException i){
            System.out.println("Error: Input harus berupa angka. Error: " + i.getMessage());
        }finally{
            System.out.println("Program kelar nih bos.");
        }
        input.close();
    }
}


