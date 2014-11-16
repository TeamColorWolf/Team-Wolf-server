package Team_wolf_server.server.DATAservice.applicationDATAservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Team_wolf_server.server.po.ApplicationPO;

/**
 * Author WHJ
 */
public interface ApproveDATAservice extends Remote {
	public ArrayList<ApplicationPO> getUnsetApplicationList() throws RemoteException;
	
	public ArrayList<ApplicationPO> getApprovalApplicationList() throws RemoteException;
	
	public ApplicationPO findApplication(String number) throws RemoteException;
	
	public ArrayList<String> getResult(String workNumber) throws RemoteException;
	
	public int approveOver(ArrayList<ApplicationPO> list) throws RemoteException;
}
