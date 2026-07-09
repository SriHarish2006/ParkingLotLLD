import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingFloor {

    private String id;
    private List<ParkingSpot> spots;

    public ParkingFloor(String id) {
        this.id = id;
        this.spots = new ArrayList<>();
    }

    public void addSpot(ParkingSpot spot) {
        spots.add(spot);
    }

    public Optional<ParkingSpot> getAvailableSpot(Vehicle vehicle) {
        return spots.stream()
                .filter(spot -> spot.canFitVehicle(vehicle))
                .findFirst();
    }
}