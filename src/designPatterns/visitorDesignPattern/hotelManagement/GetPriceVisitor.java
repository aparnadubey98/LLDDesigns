package designPatterns.visitorDesignPattern.hotelManagement;

public class GetPriceVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoomElement singleRoom) {
        System.out.println("Single room price: " + singleRoom.price());
    }

    @Override
    public void visit(DeluxeRoomElement deluxeRoom) {
        System.out.println("Deluxe room price: " + deluxeRoom.price());
    }
}
