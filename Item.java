package exercise06;

// 商品を表す基底クラス
public class Item {
	// 商品名
	private String name;

	// 単価
	private int price;

	// コンストラクタ（商品名と単価を指定）
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// 商品情報を表示する（サブクラスでオーバーライド可能）
	public void showItem() {
		System.out.printf("商品名：%s, 単価：%d, ", this.name, this.price);
	}

	// 商品名を取得
	public String getName() {
		return this.name;
	}

	// 単価を取得
	public int getPrice() {
		return this.price;
	}
}
