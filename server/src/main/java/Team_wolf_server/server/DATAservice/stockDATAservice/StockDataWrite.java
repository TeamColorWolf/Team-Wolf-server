package Team_wolf_server.server.DATAservice.stockDATAservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import Team_wolf_server.server.po.TypePO;


public interface StockDataWrite extends Remote{

	public int addType(TypePO t) throws RemoteException;
	
	public int delType(String number) throws RemoteException;
	
	/**
	 * �޸�����Ϣ�Ĳ��������ô˷������б���
	 * @param t
	 * @return
	 */
	public int updType(TypePO t) throws RemoteException;
}
