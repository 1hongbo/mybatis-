package itcast.mybatis.po;

public class User {
	private int order_num;
    private int order_item;
    private String prod_id;
    private int quantity;
	public int getOrder_num() {
		return order_num;
	}
	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}
	public int getOrder_item() {
		return order_item;
	}
	public void setOrder_item(int order_item) {
		this.order_item = order_item;
	}
	public String getProd_id() {
		return prod_id;
	}
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}
