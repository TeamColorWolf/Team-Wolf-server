package Team_wolf_server.server.DATAservice.userDATAservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import Team_wolf_server.server.po.LoginUserPO;
import Team_wolf_server.server.po.UserPO;

public interface LoginDATAservice extends Remote{
	public UserPO loginController(LoginUserPO user) throws RemoteException;
}
