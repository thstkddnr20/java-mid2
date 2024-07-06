package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public void displayItem() {
        System.out.println("장바구니 상품 출력");
        int total = 0;
        for (Item item : items) {
            System.out.println(STR."상품명: \{item.getName()}, 합계: \{item.getTotalPrice()}");
            total += item.getTotalPrice();
        }
        System.out.println(STR."전체 가격 합: \{total}");
    }
}
