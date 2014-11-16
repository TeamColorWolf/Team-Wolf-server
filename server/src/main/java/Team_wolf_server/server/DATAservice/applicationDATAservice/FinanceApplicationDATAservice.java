package Team_wolf_server.server.DATAservice.applicationDATAservice;

import java.rmi.RemoteException;

import Team_wolf_server.server.po.CashApplicationPO;
import Team_wolf_server.server.po.PaymentApplicationPO;
import Team_wolf_server.server.po.RecieptApplicationPO;
/**
 * 
 * @author WHJ
 *
 */
public interface FinanceApplicationDATAservice {
	public int submitRecieptApplication(RecieptApplicationPO po) throws RemoteException;
	
	public int submitPaymentApplication(PaymentApplicationPO po) throws RemoteException;
	
	public int submitCashApplication(CashApplicationPO po) throws RemoteException;
	
	public int approvalRecieptApplication(RecieptApplicationPO po) throws RemoteException;
	
	public int approvalPaymentApplication(PaymentApplicationPO po) throws RemoteException;
	
	public int approvalCashApplication(CashApplicationPO po) throws RemoteException;
	
	public int rejectRecieptApplication(RecieptApplicationPO po) throws RemoteException;
	
	public int rejectPaymentApplication(PaymentApplicationPO po) throws RemoteException;
	
	public int rejectCashApplication(CashApplicationPO po) throws RemoteException;
}
