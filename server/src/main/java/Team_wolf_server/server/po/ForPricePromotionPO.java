package Team_wolf_server.server.po;

import java.util.ArrayList;

import Team_wolf_server.server.vo.ForPricePromotionVO;

/**
 * 
 * @author WHJ
 *
 */
public class ForPricePromotionPO extends PromotionPO{
	double workCondition;
	ArrayList<GiftForPromotionPO> list;
	double cashCoupon;
	
	public ForPricePromotionPO(ForPricePromotionVO vo){
		super(PromotionTypePO.forPrice, vo);
		workCondition = vo.workCondition;
		cashCoupon = vo.cashCoupon;
		list = setGiftList(vo.list);
	}
}
