package Team_wolf_server.server.DATAservice.stockDATAservice;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Team_wolf_server.server.po.TypePO;

public interface StockDataRead extends Remote {

	public TypePO finType(String number) throws RemoteException;
	
	public ArrayList<TypePO> shoTypeList() throws RemoteException;
}
