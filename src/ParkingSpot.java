public abstract class ParkingSpot {

    protected String id;
    protected boolean occupied;
    protected VehicleType type;
    protected Vehicle vehicle;

    public ParkingSpot(String id, VehicleType type) {
        this.id = id;
        this.type = type;
    }

    public boolean canFitVehicle(Vehicle v) {
        return !occupied && v.getType() == type;
    }

    public void park(Vehicle v) {
        vehicle = v;
        occupied = true;
    }

    public void leave() {
        vehicle = null;
        occupied = false;
    }

}