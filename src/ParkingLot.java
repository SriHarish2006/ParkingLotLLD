import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingLot {

    private List<ParkingFloor> floors;

    public ParkingLot() {
        floors = new ArrayList<>();
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public Optional<ParkingSpot> findSpot(Vehicle vehicle) {

        for (ParkingFloor floor : floors) {
            Optional<ParkingSpot> spot = floor.getAvailableSpot(vehicle);

            if (spot.isPresent()) {
                return spot;
            }
        }

        return Optional.empty();
    }
}