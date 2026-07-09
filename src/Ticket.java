public class Ticket {

    String ticketId;
    long entryTime;
    ParkingSpot spot;

    public Ticket(String ticketId, ParkingSpot spot) {
        this.ticketId = ticketId;
        this.spot = spot;
        this.entryTime = System.currentTimeMillis();
    }
}