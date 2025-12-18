package exercise06;

// 商品の注文を管理するクラス
public class Order {
	// 注文対象の商品
	private Item item;

	// 注文数量
	private int quantity;

	// コンストラクタ（数量が0以下なら例外を投げる）
	public Order(Item item, int quantity) {
		if (quantity <= 0) {
			throw new IllegalArgumentException("数量は1以上で入力してください。");
		}
		this.item = item;
		this.quantity = quantity;
	}

	// 注文金額を計算（単価 × 数量）
	public int calculateTotal() {
		return this.item.getPrice() * this.quantity;
	}

	// 注文情報を表示（条件分岐で大口/通常のラベルを表示）
	public void showOrder() {
		this.item.showItem();
		System.out.printf("数量：%d, 金額：%d → ", this.quantity, this.calculateTotal());
		if (this.calculateTotal() >= 1000) {
			System.out.println("大口注文");
		} else {
			System.out.println("通常注文");
		}
	}
}
