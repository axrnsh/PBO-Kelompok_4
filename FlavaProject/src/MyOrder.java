import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// untuk bagian myorder yang berisi history, pelacakan, dan nama pelanggan
class MyOrder {
    // OrderId untuk melacak paket yg dipesan, customername untuk mengidentifikasi nama customer, 
    // dan items untuk histori pesanan

    private String orderId;
    private String customerName;
    private List<String> items;

    // Konstruktor dengan semua field (all field constructor)
    public MyOrder(String orderId, String customerName, List<String> items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
    }

    // Konstruktor kosong (empty constructor)
    public MyOrder() {
    }

    // mengisi data ke dalam object
    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<String> getItems() {
        return items;
    }

    // Metode toString()
    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", items=" + items +
                '}';
    }
}

// fungsi untuk melacak pesanan 
class OrderTracker {
    private Map<String, MyOrder> orderMap;
    private List<MyOrder> orderHistory;

    public OrderTracker() {
        orderMap = new HashMap<>();
        orderHistory = new ArrayList<>();
    }

    public void placeOrder(MyOrder order) {
        orderMap.put(order.getOrderId(), order);
        orderHistory.add(order);
        System.out.println("Order placed successfully. Order ID: " + order.getOrderId());
    }

    public void trackOrder(String orderId) {
        if (orderMap.containsKey(orderId)) {
            MyOrder order = orderMap.get(orderId);
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Customer Name: " + order.getCustomerName());
            System.out.println("Items: " + order.getItems());
        } else {
            System.out.println("Order not found.");
        }
    }

}
}
 