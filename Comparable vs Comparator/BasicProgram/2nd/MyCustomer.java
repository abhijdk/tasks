
public class MyCustomer 
{
	private Integer cId;
	private String cName;
	private Double cBill;
	protected MyCustomer(Integer cId, String cName, Double cBill) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cBill = cBill;
	}
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Double getcBill() {
		return cBill;
	}
	public void setcBill(Double cBill) {
		this.cBill = cBill;
	}
	@Override
	public String toString() {
		return "MyCustomer [cId=" + cId + ", cName=" + cName + ", cBill=" + cBill + "]";
	}
	
}
