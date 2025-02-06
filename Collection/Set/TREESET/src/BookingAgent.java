public class BookingAgent {
    public static void main(String[] args) {
        int rows = 10;
        int totalSeats = 100;
        Theatre theatre = new Theatre("KONARK",rows,totalSeats);
        theatre.printSeatMap();

    }
}
