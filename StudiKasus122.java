
import java.util.Scanner;

public class StudiKasus122 {
    public static void main(String[] args) {
        Scanner nad = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int diskon;
        int totalBayar;
        int kembalian;
        int kurang;

        System.out.println("--- KEDAI KOPI SENJA ---");
        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = nad.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = nad.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar = totalHarga - diskon;
        
        System.out.println("Total harga: Rp" +totalHarga);
        System.out.println("Diskon: Rp" +diskon);
        System.out.println("Total bayar: Rp" +uangBayar);

       
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: Rp");
        }else{
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup. kurang Rp " +kurang);
        }
        nad.close();

    }
    
}
