package SelfProject.ProgramKasir;

public class Barang {
    private String nama;
    private int stok;
    private int hargaSatuan;

    public void setNama(String inputNama){
        nama = inputNama;
    }
    public void setStok(int inputStok){
        stok = inputStok;
    }
    public void setHarga(int inputHarga){
        hargaSatuan = inputHarga;
    }

    public String getNama(){
        return nama;
    }
    public int getStok(){
        return stok;
    }
    public int getHarga(){
        return hargaSatuan;
    }
}
