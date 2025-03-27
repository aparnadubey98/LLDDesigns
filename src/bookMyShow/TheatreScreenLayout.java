package bookMyShow;

class TheatreSeating {
    private char[][] seats;
    private char[][] seatTypes;

    public TheatreSeating(int rows, int cols) {
        seats = new char[rows][cols];
        seatTypes = new char[rows][cols];
        initializeSeats();
    }

    private void initializeSeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = 'O'; // 'O' represents an available seat
                if (i < 2) {
                    seatTypes[i][j] = 'V'; // VIP seats
                } else if (i < 5) {
                    seatTypes[i][j] = 'P'; // Premium seats
                } else {
                    seatTypes[i][j] = 'R'; // Regular seats
                }
            }
        }
    }

    public void displaySeating() {
        System.out.println("\n      MOVIE SCREEN      ");
        System.out.println("=======================");
        System.out.println("      [SCREEN]      ");
        System.out.println("=======================");
        System.out.println("Seat Types: V - VIP, P - Premium, R - Regular");
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + " (" + seatTypes[i][0] + ") : ");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean bookSeat(int row, int col) {
        if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length) {
            System.out.println("Invalid seat selection.");
            return false;
        }
        if (seats[row][col] == 'X') {
            System.out.println("Seat already booked.");
            return false;
        }
        seats[row][col] = 'X'; // 'X' represents a booked seat
        System.out.println("Seat booked successfully at Row " + (row + 1) + " Column " + (col + 1) + " (" + seatTypes[row][col] + ")");
        return true;
    }
}

public class TheatreScreenLayout {
    public static void main(String[] args) {
        TheatreSeating seating = new TheatreSeating(8, 10); // Example: 8 rows, 10 seats per row
        seating.displaySeating();

        seating.bookSeat(0, 5); // VIP
        seating.bookSeat(3, 5); // Premium
        seating.bookSeat(6, 2); // Regular
        seating.displaySeating();
    }
}
