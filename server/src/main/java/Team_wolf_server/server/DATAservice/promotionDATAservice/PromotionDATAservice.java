package Team_wolf_server.server.DATAservice.promotionDATAservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Team_wolf_server.server.po.PromotionPO;

/**
 * 
 * @author WHJ
 *
 */
public interface PromotionDATAservice extends Remote{

	public void addPromotion (PromotionPO po) throws RemoteException;
	
	public void delPromotion (PromotionPO po) throws RemoteException;
	
	public PromotionPO findPromotion (PromotionPO po) throws RemoteException;
	
	public ArrayList<PromotionPO> show () throws RemoteException;
	
}
