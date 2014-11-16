package Team_wolf_server.server.po;

import java.io.Serializable;

import Team_wolf_server.server.vo.UserType;
import Team_wolf_server.server.vo.UserVO;

/**
 * 
 * @author WHJ
 *
 */
public class UserPO  implements Serializable{
	public String userName;//用户名
	public String password;//密码
	public String workID;//工作编号
	public UserType power;//权限
	
	public UserPO(UserVO vo){
		userName = vo.userName;
		password = vo.password;
		workID = vo.workID;
		power = vo.power;
	}
}
