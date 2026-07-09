import java.util.UUID;

public class ParkingManager {

    private ParkingLot parkingLot;
    private PricingStrategy pricingStrategy;

    public ParkingManager(ParkingLot parkingLot,
                          PricingStrategy pricingStrategy) {

        this.parkingLot = parkingLot;
        this.pricingStrategy = pricingStrategy;
    }

    public Ticket parkVehicle(Vehicle vehicle) {

        ParkingSpot spot = parkingLot.findSpot(vehicle)
                .orElseThrow(() ->
                        new RuntimeException("No parking spot available"));

        spot.park(vehicle);

        return new Ticket(UUID.randomUUID().toString(), spot);
    }

    public double exitVehicle(Ticket ticket) {

        long exitTime = System.currentTimeMillis();

        long duration = exitTime - ticket.entryTime;

        ticket.spot.leave();

        return pricingStrategy.calculate(duration);
    }
}