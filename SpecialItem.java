package exercise06;

// 特価商品を表すクラス（Itemクラスを継承）
public class SpecialItem extends Item {

    // コンストラクタ（親クラスのコンストラクタを呼び出す）
    public SpecialItem(String name, int price) {
        super(name, price);
    }

    // 商品情報を表示（「【特価】」を追加してオーバーライド）
    @Override
    public void showItem() {
    	System.out.printf("【特価】商品名：%s, 単価：%d, ", this.getName(), this.getPrice());
    }
}
