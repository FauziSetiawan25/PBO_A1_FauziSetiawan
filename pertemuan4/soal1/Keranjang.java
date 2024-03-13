package pertemuan4.soal1;

import java.util.ArrayList;

public class Keranjang {
    ArrayList<Barang> listBarang = new ArrayList<Barang>();
    int totalBarang = 0;
    int totalHarga = 0;


    void tambah(Barang Barang){

        if(totalBarang< 5){
            this.listBarang.add(Barang);
            System.out.println("Ditambahkan");
            totalBarang += Barang.jumlahBarang;
            totalHarga += Barang.hargaBarang * Barang.jumlahBarang;
        }else {
            System.out.println("Penuh");
        }
    }
    void PrintSemua(){
        System.out.println("Jumlah barang yang ada di keranjang: " + totalBarang);
        System.out.println("Barangnya pada keranjang: ");
        for (Barang barang : this.listBarang){
            System.out.println("# "+ barang.namaBarang +", jumlah : " + barang.jumlahBarang);

        }System.out.println("Total harga yang harus dibayar: "+ totalHarga);
    }
}
