package Team_wolf_server.server.vo;

import java.util.ArrayList;

/**
 * 
 * @author XYJ
 *
 */
public class TypeListVO {

	private ArrayList<TypeVO> typeL=new ArrayList<TypeVO>();
	private String TypeListInfo;
	
	public void addType(TypeVO t){
		typeL.add(t);
	}
	public String getInfo(){
		return TypeListInfo;
	}
}
