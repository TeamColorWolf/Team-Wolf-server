package Team_wolf_server.server.DATAservice.saleDATAservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import Team_wolf_server.server.po.ImportListPO;
import Team_wolf_server.server.po.ImportRejectListPO;
import Team_wolf_server.server.po.SaleListPO;
import Team_wolf_server.server.po.SaleRejectListPO;


public interface SaleDATAservice extends Remote{

	public void addImport (ImportListPO ipo) throws RemoteException;
	
	public void addImportReject (ImportRejectListPO irpo) throws RemoteException;
	
	public void addSale (SaleListPO spo) throws RemoteException;
	
	public void addSaleReject (SaleRejectListPO srpo) throws RemoteException;
	
}
