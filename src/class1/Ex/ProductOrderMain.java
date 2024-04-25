package class1.Ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        //1번 상품
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 5000;
        productOrder1.quantity = 2;
        productOrders[0] = productOrder1;

        //2번 상품
        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 2000;
        productOrder2.quantity = 1;
        productOrders[1] = productOrder2;

        //3번 상품
        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 3;
        productOrders[2] = productOrder3;

        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + " 가격 " + productOrder.price + " 수량 " + productOrder.quantity);
        }
    }

}

