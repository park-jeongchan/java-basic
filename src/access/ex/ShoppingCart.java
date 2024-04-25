package access.ex;

public class ShoppingCart {
    private Item[] items;
    private int count;

    ShoppingCart() {
        items = new Item[10];

    }

    public void addItem(Item item) {
        if (isCountValid()) {
            items[count] = item;
            count++;
        } else {
            System.out.println("장바구니가 가득 찼습니다.");
        }


    }

    public void displayItems() {
        int totalPrice= 0;
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + " 합계: " + (totalPrice= item.getPrice() * item.getValue()));
        }
        System.out.println("전체 가격 합: " + totalPrice);
    }
    private boolean isCountValid() {
        return count < items.length;
    }
}
