package Team_wolf_server.server.DATAservice.logDATAservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import Team_wolf_server.server.po.UserPO;


public interface UserLogDATAservice extends Remote{
	public void addUserLog(Team_wolf_server.server.po.UserPO user) throws RemoteException;
	public void removeUserLog(String user) throws RemoteException;
	public void updateUserLog(UserPO user) throws RemoteException;
}
