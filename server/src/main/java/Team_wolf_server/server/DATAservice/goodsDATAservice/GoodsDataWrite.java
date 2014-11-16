package Team_wolf_server.server.DATAservice.goodsDATAservice;
import java.rmi.Remote;
import java.rmi.RemoteException;

import Team_wolf_server.server.po.GoodsPO;

public interface GoodsDataWrite extends Remote {

	public int addGood(GoodsPO g) throws RemoteException;
	
	public int delGood(String number) throws RemoteException;
	
	/**
	 * �κ��漰���޸���Ʒ��ݵ���Ϊ�����ô˷������б���
	 * @param g
	 * @return
	 */
	public int updGood(GoodsPO g) throws RemoteException;
	
	
}
