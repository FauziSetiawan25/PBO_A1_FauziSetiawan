package pertemuan4;

import java.util.ArrayList;
import java.util.List;

public class Perpus {
    String nama;
    String lokasi;
    int jamOprasional;
    ArrayList<Buku> listBuku;

    Perpus(){
        System.out.println("P");
        listBuku = new ArrayList<Buku>();
        jamOprasional = 7;
    }

    Perpus(String namaPerpus, String lokasiPerpus, int jumlahHari){
        nama = namaPerpus;
        lokasi = lokasiPerpus;
        jamOprasional = jumlahHari;
    }
    void PrintSemua(){
        for (Buku book : this.listBuku){
            System.out.println(book.title);
        }
    }

    int harilibur(){
        int realhari = 7;
        int libur = realhari - jamOprasional;

        return  libur;
    }

    void tambahbuku(List<Buku> bukubaru){
        for(int i = 0;i < bukubaru.size(); i++){
            Buku b = bukubaru.get(i);
            this.listBuku.add(b);
        }
    }
}
