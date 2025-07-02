package MultilevelInheritance;
public class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    void getOrderStatus() {
        System.out.println("Order ID: " + orderId + ", Delivered on: " + deliveryDate);
    }

    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(101, "2025-07-01", "TRK123456", "2025-07-02");
        d.getOrderStatus();
    }
}
