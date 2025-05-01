package bookMyShow.seat;

public class Seat {
    private final int seatId;
    private final SeatType seatType;
    private SeatStatus seatStatus;
    private final int row;
    private final int column;
    private final int price;

    public Seat(int seatId, SeatType seatType, int row, int column, int price) {
        this.seatId = seatId;
        this.seatType = seatType;
        this.row = row;
        this.column = column;
        this.price = price;
        this.seatStatus = SeatStatus.AVAILABLE;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getSeatId() {
        return seatId;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public int getPrice() {
        return price;
    }
}
