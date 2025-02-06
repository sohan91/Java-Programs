import java.util.NavigableSet;
import java.util.TreeSet;

public class Theatre {
    class Seat implements Comparable<Seat>
    {
        private String seatNum;
        private boolean reserved;

        public Seat(char rowChar,int seatNo)
        {
            this.seatNum = "%c%03d".formatted(rowChar,seatNo).toUpperCase();

        }
        public String toString()
        {
            return seatNum;
        }

        @Override
        public int compareTo(Seat o) {
            return seatNum.compareTo(o.seatNum);
        }
    }
    private String theatreName;
    private int seatsPerRow;
    private NavigableSet<Seat> seats;

    public Theatre(String theatreName,int rows,int totalSeats)
    {
        this.theatreName = theatreName;
        this.seatsPerRow = totalSeats/rows;

        seats = new TreeSet<>();
        for(int i = 0;i<totalSeats;i++)
        {
            char rowChar = (char)(i/seatsPerRow+(int)'A');
            int seatInRow = i%seatsPerRow+1;
            seats.add(new Seat(rowChar,seatInRow));
        }
    }
    public void printSeatMap()
    {
        String separatorLine = "_".repeat(90);
        System.out.printf("1$s%n%2$s Seat Map%n%1$s%n",separatorLine,theatreName);
        int index = 0;
        for(Seat s : seats)
        {
            System.out.printf("%-8s%s",
                    s.seatNum+((s.reserved)?"(●)":""),
                    ((index++ + 1)%seatsPerRow == 0)?"\n":"");

        }
        System.out.println(separatorLine);
    }
}
