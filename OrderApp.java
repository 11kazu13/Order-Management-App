package exercise06;

import java.util.ArrayList;

// メインアプリケーションクラス
public class OrderApp {
	public static void main(String[] args) {
		System.out.println("=== 注文管理アプリ ===");

		// 注文を管理するリストを作成
		ArrayList<Order> orders = new ArrayList<Order>();

		// 特価商品と通常商品の注文を追加
		Item pencil = new SpecialItem("鉛筆", 50);
		Item eraser = new Item("消しゴム", 80);

		Order order_1 = new Order(pencil, 20);
		Order order_2 = new Order(eraser, 4);

		orders.add(order_1);
		orders.add(order_2);

		System.out.println("\n--- 注文一覧 ---");

		for (Order order : orders) {
			order.showOrder();
		}

		// 総売上金額
		int sum = 0;
		
		for (Order order : orders) {
			sum += order.calculateTotal();
		}

		// 総売上を表示
		System.out.println("\n--- 総売上 ---");
		System.out.println(sum);
	}
}
