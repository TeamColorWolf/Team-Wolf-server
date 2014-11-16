package Team_wolf_server.server.po;

import java.io.Serializable;
import java.util.ArrayList;


public class PresentListPO extends ApplicationPO implements Serializable{
	
	ArrayList<String> plInfo;
	String operator;
	String customer;
	
	public PresentListPO(ArrayList<GoodsPO> pl, String operator, String customer){
		
	}

	public ArrayList<String> getPlInfo() {
		return plInfo;
	}

	public void setPlInfo(ArrayList<String> plInfo) {
		this.plInfo = plInfo;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}
}
