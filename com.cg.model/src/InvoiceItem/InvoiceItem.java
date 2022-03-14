package InvoiceItem;

public class InvoiceItem {

	private String Id;
	private String desc;
	private int qty;
	private double unitPrice;
	
public InvoiceItem(String i,String d,int q,double u) {
	 Id=i;
	desc=d;
	qty=q;
	unitPrice=u;
	}
public String getId() {
	return Id;
}
public String getDesc() {
	return desc;
}
public int getQty() {
	return qty;
}
public void setQty(int q) {
	qty=q;
}
public double getUnitprice() {
	return unitPrice;
}
public void setUnitprice(double u) {
	unitPrice=u;
}
public double getTotal() {
	return unitPrice*qty;
	
}
@Override
public String toString() {
	return "InvoiceItem [Id=" + Id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
}

}
