package Team_wolf_server.server.po;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import Team_wolf_server.server.vo.TimeVO;

/**
 * 
 * @author WHJ
 *
 */
public class TimePO implements Serializable{
	public Date date;
	public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	public TimePO(TimeVO vo){
		date = vo.date;
	}
	
	public int timeCompare(TimePO t){
		return date.compareTo(t.date);
	}
}
