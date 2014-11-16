package Team_wolf_server.server.po;

import java.util.ArrayList;


/**
 * 
 * @author WKS
 *
 */
public class ImportListPO extends ApplicationPO{
	
	/**
	 * 供应商
	 */
	String supplier;
	
	/**
	 * 仓库
	 */
	String storage;
	
	/**
	 * 入库商品列表
	 */
	ArrayList<GoodsPO> GoodsList;
	
	/**
	 * 单据备注
	 */
	String remark;
	
	/**
	 * 总额
	 */
	double total;

	
	
	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public ArrayList<GoodsPO> getGoodsList() {
		return GoodsList;
	}

	public void setGoodsList(ArrayList<GoodsPO> goodsList) {
		GoodsList = goodsList;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
