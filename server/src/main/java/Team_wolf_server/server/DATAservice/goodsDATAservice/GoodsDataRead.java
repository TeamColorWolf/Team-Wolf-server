package Team_wolf_server.server.DATAservice.goodsDATAservice;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Team_wolf_server.server.po.GoodsPO;

public interface GoodsDataRead extends Remote {

	public GoodsPO finGood(String number) throws RemoteException;
	public ArrayList<GoodsPO> getGoodList() throws RemoteException;
	
}
