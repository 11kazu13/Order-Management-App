package exercise06.test;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise06.Item;
import exercise06.Order;
import exercise06.SpecialItem;

// Orderクラスのテスト
public class OrderTest {

    // 正常に金額が計算されるか確認
    @Test
    public void testCalculateTotal() {
        Item item = new Item("定規", 200);
        Order order = new Order(item, 3);
        assertEquals(600, order.calculateTotal());
    }

    // 数量0で例外が発生するか確認
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeQuantityThrowsException() {
        Item item = new Item("消しゴム", 100);
        new Order(item, 0); // 例外を期待
    }

    // SpecialItemクラスの動作確認
    @Test
    public void testSpecialItemInstance() {
        SpecialItem item = new SpecialItem("色鉛筆", 150);
        assertEquals("色鉛筆", item.getName());
        assertEquals(150, item.getPrice());
    }
}
