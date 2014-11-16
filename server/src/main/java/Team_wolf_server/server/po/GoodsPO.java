package Team_wolf_server.server.po;

import java.io.Serializable;

import Team_wolf_server.server.vo.GoodsVO;


/**
 * 
 * @author XYJ
 *
 */
public class GoodsPO implements Serializable {

	TypePO parent;
	String number;
	String name;
	String model;
	int amount;
	double imprice;
	double exprice;
	double latestImprice;
	double latestExprice;
	int WarningLine;
	
	public GoodsPO(GoodsVO g) {
		// TODO Auto-generated constructor stub
	}
	public TypePO getParent() {
		return parent;
	}
	public void setParent(TypePO parent) {
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
	public void setWarningLine(int WL){
		this.WarningLine=WL;
	}
	public boolean checkWL(){
		return amount<=WarningLine;
	}
	
}
