class BookTheaterSeats{
    int total_seats=10;
    synchronized void bookSeat(int seat){
        if(total_seats>=seat){
            System.out.println("Seats booked succesfully");
            total_seats=total_seats-seat;
            System.out.println("Seats left: "+total_seats);
        }
        else{
            System.out.println("Seats cannot be booked");
            System.out.println("Seats left are: "+total_seats);
        } 
    }
}
class MovieBookApp extends Thread{
    static BookTheaterSeats b;
    int seats;
    public void run(){

        b.bookSeat(seats);
    }
    public static void main(String[] args) {
        b=new BookTheaterSeats();
        MovieBookApp sahil=new MovieBookApp();
        sahil.seats=8;
        sahil.start();

        MovieBookApp Krati=new MovieBookApp();
        Krati.seats=5;
        Krati.start();
    }
}