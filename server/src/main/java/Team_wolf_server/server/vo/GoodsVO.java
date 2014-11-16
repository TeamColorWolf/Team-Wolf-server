package Team_wolf_server.server.vo;
/**
 * 
 * @author XYJ
 *
 */
public class GoodsVO {

	private String parent;
	private String number;
	private String name;
	private String model;
	private int amount;
	private int WarningLine;
	private double imprice;
	private double exprice;
	private double latestImprice;
	private double latestExprice;
	private String goodsInfo;
	private int packSuccess;
	
	//添加商品
	public GoodsVO(String parent, String number, String name, String model, String amount, String imprice, String exprice, String latestImprice, String latestExprice, String WL){
		
		this.parent=parent;
		this.number=number;
		this.name=name;
		this.model=model;
		
		try{
			this.WarningLine=Integer.parseInt(WL);
			this.amount=Integer.parseInt(amount);
			this.imprice=Double.parseDouble(imprice);
			this.exprice=Double.parseDouble(exprice);
			this.latestExprice=Double.parseDouble(latestExprice);
			this.latestImprice=Double.parseDouble(latestImprice);
			}catch(Exception e){
				packSuccess=1;
			}
	}
	
	public int gerWarningLine(){
		return WarningLine;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getImprice() {
		return imprice;
	}
	public void setImprice(double imprice) {
		this.imprice = imprice;
	}
	public double getExprice() {
		return exprice;
	}
	public void setExprice(double exprice) {
		this.exprice = exprice;
	}
	public double getLatestImprice() {
		return latestImprice;
	}
	public void setLatestImprice(double latestImprice) {
		this.latestImprice = latestImprice;
	}
	public double getLatestExprice() {
		return latestExprice;
	}
	public void setLatestExprice(double latestExprice) {
		this.latestExprice = latestExprice;
	}
	
	public String getInfo(){
		return goodsInfo;
	}
	
	public int isPackSuccess(){
		return packSuccess;
	}
}
