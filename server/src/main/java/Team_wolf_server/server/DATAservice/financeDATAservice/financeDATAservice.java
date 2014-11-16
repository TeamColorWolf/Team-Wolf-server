package Team_wolf_server.server.DATAservice.financeDATAservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Team_wolf_server.server.po.FinancePO;


public interface financeDATAservice extends Remote{
	public FinancePO find(String name)throws RemoteException;
	public int insert(ArrayList<FinancePO> po)throws RemoteException;
	public int delete(FinancePO po)throws RemoteException;
	public int update(FinancePO prepo,FinancePO newpo)throws RemoteException;
	
}
