package pertemuan4.soal2;

import java.util.ArrayList;

public class MovieApp {
    ArrayList<Film> listFilm = new ArrayList<Film>();
    int booking = 82;
    ArrayList<Integer> bookingan = new ArrayList<>();

    void addFilm(Film Film){
        this.listFilm.add(Film);
    }

    void displayAllFilms(){
        System.out.println("List of Films:");
        for (Film film : this.listFilm){
            System.out.println(film.title+ " - " + film.genre+ " - Duration: " +film.duration+
                    " mins - Avaible Seats: "+film.availableSeats);
        }
        System.out.println();
    }

    void searchFilm(String title){
        int ada = 0;
        for (int i = 0; i <= listFilm.toArray().length -1; i++){
            if (listFilm.get(i).title.equalsIgnoreCase(title)) {
                ada += 1;
            }
        }if (ada == 1){
            System.out.println("Film Tersedia");
        }else {
            System.out.println("Film Tidak Tersedia");
        }
        System.out.println();
    }

    void bookFilm(Film Film, int numberOfTickets){
        for (int i = 0; i < listFilm.toArray().length -1; i++){
            if (listFilm.get(i) == Film){
                if (numberOfTickets < listFilm.get(i).availableSeats){
                    System.out.println("Pesanan berhasil");
                    System.out.println("Film :"+ listFilm.get(i).title);
                    System.out.println("Jumlah tiket: " + numberOfTickets);
                    booking += 1;
                    bookingan.add(booking);
                    System.out.println("Bookin id: " + booking);
                    listFilm.get(i).availableSeats -= numberOfTickets;
                }
            }else {
                System.out.println("Tidak dapat diproses, kursi tidak tersedia");
            }
        }
        System.out.println();
    }
    void searchBooking(int bookingId){
        for (int i = 0; i < bookingan.toArray().length; i++){
            if(bookingan.get(i) == bookingId){
                System.out.println("Pesanan Ditemukan");
            }else {
                System.out.println("Pesanan Tidak ditemukan");
            }
        }
    }
}
