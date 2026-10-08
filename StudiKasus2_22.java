
import java.util.Scanner;

public class StudiKasus2_22 {
    public static void main(String[] args) {
        Scanner nad = new Scanner(System.in);
        String nama;
        String jenis;
        String status;
        String alasan;
        int jumlahDokumen;
        int peringkat;
        int statusPKM;

        System.out.println("--- VALIDASI PRESTASI MAHASISWA ---");
        System.out.print("Nama Mahasiswa: ");
        nama = nad.nextLine();
        System.out.print("Jenis Kegiatan Mahasiswa: ");
        jenis = nad.nextLine().trim();

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen: ");
            jumlahDokumen = nad.nextInt();
            System.out.print("Peringkat juara: ");
            peringkat = nad.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    status = "Dokumen lengkap dan juara " +peringkat+". Dana penghargaan diberikan";  
                }else{
                    status = "Dokumen tidak lengkap (kurang "+(4 - jumlahDokumen)+ " dokumen). Dana penghargaan tidak diberikan.";
                }
            }else{
                status = "BUkan juara 1, 2, atau 3.";
            }
        }else if (jenis.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen: ");
            jumlahDokumen = nad.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPKM = nad.nextInt();
            if (statusPKM == 1) {
                if (jumlahDokumen == 4) {
                    status = "PKM lolos pendanaan dan dokumen lengkap. Dana penghargaan diberikan.";  
                }else{
                    status = "Dokumen tidak lengkap (kurang " +(4 - jumlahDokumen)+ " dokumen). Dana penghargaan tidak diberikan.";
                }
                
            }else{
                status = "PKM tidak lolos pendanaan. Daana penghargaan tidak diberikan.";
            }
        }else{
            status =  "Kegiatan kategori lainnya, Dana penghargaan tidak diberikan.";
        }
        System.out.println("Status : " + status);
        
    }
}