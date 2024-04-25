package ref.ex;


public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];


        //1번 상품
        productOrders[0]= createOrder("두부", 5000, 2);
        //2번 상품
        productOrders[1]= createOrder("김치", 2000, 1);
        //3번 상품
        productOrders[2]= createOrder("콜라", 1500, 3);

        printOrders(productOrders);

        int total = 0;
        int totalAmount = getTotalAmount(productOrders, total);


    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + " 가격 " + productOrder.price + " 수량 " + productOrder.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders, int total) {
        for (ProductOrder productOrder : productOrders) {
            total += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 금액은 " + total + "입니다.");
        return total;
    }
}
