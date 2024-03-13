package pertemuan4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Buku book = new Buku();
        book.title = "PBO JAYA";
        book.id = 1;
        book.author =  "Ujang";
        book.numberOfPages = 100;

        Buku book2 = new Buku();
        book2.title = "HTML JAYA";
        book2.id = 2;
        book2.author =  "Udin";
        book2.numberOfPages = 150;

        Perpus SV = new Perpus();
        SV.nama = "Vokasi";
        SV.lokasi = "Ujung";

        SV.listBuku.add(book);
        SV.listBuku.add(book2);

        System.out.println(SV.jamOprasional);

        Perpus kota = new Perpus("Jua","kiri",9);
        System.out.println(kota.lokasi);

        SV.PrintSemua();

        System.out.println(SV.harilibur());

        Buku b1 = new Buku();
        b1.title = "PHP JAYA";
        Buku b2 = new Buku();
        b2.title = "JS JAYA";

        List<Buku> bukubaru = new ArrayList<Buku>();
        bukubaru.add(b1);
        bukubaru.add(b2);
        SV.tambahbuku(bukubaru);
        SV.PrintSemua();
    }
}
