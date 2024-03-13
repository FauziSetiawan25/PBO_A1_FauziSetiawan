package pertemuan4.soal1;

public class Main {
    public static void main(String[] args) {
        Barang barang1 = new Barang("Beras",50000,1);
        Barang barang2 = new Barang("Sabun",10000,2);
        Barang barang3 = new Barang("Sampo",5000,2);
        Barang barang4 = new Barang("Gula",15000,3);

        Keranjang keranjang1 = new Keranjang();
        keranjang1.tambah(barang1);
        keranjang1.tambah(barang2);
        keranjang1.tambah(barang3);
        keranjang1.tambah(barang4);

        System.out.println("\n=================\n");

        keranjang1.PrintSemua();
    }
}
