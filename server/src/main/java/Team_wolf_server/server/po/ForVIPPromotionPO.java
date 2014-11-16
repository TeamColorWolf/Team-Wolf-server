package Team_wolf_server.server.po;

import java.io.Serializable;
import java.util.ArrayList;

import Team_wolf_server.server.vo.ForVIPPromotionVO;

/**
 * 
 * @author WHJ
 *
 */
public class ForVIPPromotionPO extends PromotionPO implements Serializable{
	int VIPrank;
	ArrayList<GiftForPromotionPO> list;
	double discount;
	double cashCoupon;
	
	public ForVIPPromotionPO(ForVIPPromotionVO vo){
		super(PromotionTypePO.forVIP, vo);
		VIPrank = vo.VIPrank;
		discount = vo.discount;
		cashCoupon = vo.cashCoupon;
		list = setGiftList(vo.list);
	}
}
