public class Main {

    public static void main(String[] args) throws Exception {

        ParkingLot parkingLot = new ParkingLot();

        ParkingFloor floor1 = new ParkingFloor("Floor-1");

        floor1.addSpot(new CarSpot("C1"));
        floor1.addSpot(new CarSpot("C2"));
        floor1.addSpot(new BikeSpot("B1"));
        floor1.addSpot(new TruckSpot("T1"));

        parkingLot.addFloor(floor1);

        PricingStrategy pricing = new HourlyPricingStrategy();

        ParkingManager manager =
                new ParkingManager(parkingLot, pricing);

        Vehicle car = new Car("TN10AB1234");

        Ticket ticket = manager.parkVehicle(car);

        System.out.println("Vehicle Parked Successfully");
        System.out.println("Ticket ID : " + ticket.ticketId);

        Thread.sleep(3000);

        double fee = manager.exitVehicle(ticket);

        System.out.println("Parking Fee : ₹" + fee);
    }
}