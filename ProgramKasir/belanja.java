package SelfProject.ProgramKasir;
import java.util.Scanner;

public class belanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Barang pensil = new Barang();
        Barang pulpen = new Barang();
        Barang penghapus = new Barang();

        // input pensil
        pensil.setNama("Pensil");
        pensil.setStok(10);
        pensil.setHarga(1000);
        // input pulpen
        pulpen.setNama("Pulpen");
        pulpen.setStok(10);
        pulpen.setHarga(2000);
        // input penghapus
        penghapus.setNama("Penghapus");
        penghapus.setStok(10);
        penghapus.setHarga(500);
        
        boolean open = true;
        int hargaTotal = 0;
        
        while (open) {
            
        System.out.println("================================");
        System.out.println("Selamat Datang Di Toko!! \nMasukan kode barang untuk membeli : \n1 = Pensil | " + "Stok = " + pensil.getStok() + "\n2 = Pulpen | " + "Stok = " + pulpen.getStok() + "\n3 = Penghapus | " + "Stok = " + penghapus.getStok() + "\n4 = Selesai dan Check out");
        System.out.print("Masukan Kode Barang : ");
        int user = input.nextInt();

        switch (user) {
            case 1:
            boolean pencilConfirmed = false;
            while (!pencilConfirmed) {
                System.out.println("================================");
                System.out.print("Ingin Membeli Pensil? \n 1 = ya / 2 = tidak\n = ");
                int pensilConfirm = input.nextInt();
                if (pensilConfirm == 1) {
                    System.out.println("================================");
                    System.out.println("Masukan jumlah barang : ");
                    int jumlahBarang = input.nextInt();
                    if (jumlahBarang <= pensil.getStok()) {
                        pensil.setStok(pensil.getStok() - jumlahBarang);
                        hargaTotal += jumlahBarang * pensil.getHarga();
                        System.out.println("================================");
                        System.out.println("Total Harga Barang = " 
                        + jumlahBarang * pensil.getHarga());
                        pencilConfirmed = true;
                    }
                    else if (jumlahBarang > pensil.getStok()) {
                        System.out.println("================================");
                        System.out.println("Stok barang tidak mencukupi.");
                        pencilConfirmed = true;
                    }
                    else if (jumlahBarang < 0) {
                        System.out.println("================================");
                        System.out.println("Masukan jumlah yang benar.");
                    }
                }
                else if(pensilConfirm == 2){
                    System.out.println("================================");
                    System.out.println("Terima kasih sudah mampir");
                    pencilConfirmed = true;
                }
                else{
                    System.out.println("Opsi tidak ada.");
                }
            }
                break;
            case 2:
            boolean pulpenConfirmed = false;
            while (!pulpenConfirmed) {
                System.out.println("================================");
                System.out.print("Ingin Membeli Pulpen? \n 1 = ya / 2 = tidak\n = ");
                int pulpenConfirm = input.nextInt();
                if (pulpenConfirm == 1) {
                    System.out.println("================================");
                    System.out.println("Masukan jumlah barang : ");
                    int jumlahBarang = input.nextInt();
                    if (jumlahBarang <= pulpen.getStok()) {
                        pulpen.setStok(pulpen.getStok() - jumlahBarang);
                        hargaTotal += jumlahBarang * pulpen.getHarga();
                        System.out.println("================================");
                        System.out.println("Total Harga Barang = " 
                        + jumlahBarang * pulpen.getHarga());
                        pulpenConfirmed = true;
                    }
                    else if (jumlahBarang > pulpen.getStok()) {
                        System.out.println("================================");
                        System.out.println("Stok barang tidak mencukupi.");
                        pulpenConfirmed = true;
                    }
                    else if (jumlahBarang <= 0) {
                        System.out.println("================================");
                        System.out.println("Masukan jumlah yang benar.");
                    }
                }
                else if(pulpenConfirm == 2){
                    System.out.println("================================");
                    System.out.println("Terima kasih sudah mampir");
                    pulpenConfirmed = true;
                }
                else{
                    System.out.println("Opsi tidak ada.");
                }
            }
                break;
            case 3:
            boolean penghapusConfirmed = false;
            while (!penghapusConfirmed) {
                System.out.println("================================");
                System.out.print("Ingin Membeli Pensil? \n 1 = ya / 2 = tidak\n = ");
                int penghapusConfirm = input.nextInt();
                if (penghapusConfirm == 1) {
                    System.out.println("================================");
                    System.out.println("Masukan jumlah barang : ");
                    int jumlahBarang = input.nextInt();
                    if (jumlahBarang <= penghapus.getStok()) {
                        penghapus.setStok(penghapus.getStok() - jumlahBarang);
                        hargaTotal += jumlahBarang * penghapus.getHarga();
                        System.out.println("================================");
                        System.out.println("Total Harga Barang = " 
                        + jumlahBarang * pensil.getHarga());
                        penghapusConfirmed = true;
                    }
                    else if (jumlahBarang > penghapus.getStok()) {
                        System.out.println("================================");
                        System.out.println("Stok barang tidak mencukupi.");
                        penghapusConfirmed = true;
                    }
                    else if (jumlahBarang < 0) {
                        System.out.println("================================");
                        System.out.println("Masukan jumlah yang benar.");
                    }
                }
                else if(penghapusConfirm == 2){
                    System.out.println("================================");
                    System.out.println("Terima kasih sudah mampir");
                    penghapusConfirmed = true;
                }
                else{
                    System.out.println("Opsi tidak ada.");
                }
            }
                break;
            case 4:
                System.out.println("================================");
                System.out.println("Total Harga Belanjaan Anda Adalah : Rp." + hargaTotal);
                open = false;
                break;
            default:
                     System.out.println("Opsi tidak ada.");
                break;
        } 
    }
    input.close();
}
}