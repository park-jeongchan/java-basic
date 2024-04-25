package ref.ex;


import java.util.Scanner;

public class ProductOrderMain3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int num = inputOrdersOfNumber();
        ProductOrder[] productOrders = new ProductOrder[num];

        createOrder2(productOrders);

        printOrders(productOrders);

        int total = 0;
        total = getTotalAmount(productOrders, total);


    }

    static int inputOrdersOfNumber() {
        System.out.print("입력할 주문의 개수 입력: ");
        int num = scanner.nextInt();
        return num;
    }

    static void createOrder2(ProductOrder[] productOrders){
        for (int i = 0; i < productOrders.length; i++) {
            ProductOrder productOrder = new ProductOrder();

            System.out.println(i + "번쨰 주분 정보를 입력하세요");
            System.out.print("상품명: ");
            productOrder.productName = scanner.next();
            System.out.print("가격: ");
            productOrder.price = scanner.nextInt();
            System.out.print("수량: ");
            productOrder.quantity = scanner.nextInt();

            productOrders[i] = productOrder;
        }
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
