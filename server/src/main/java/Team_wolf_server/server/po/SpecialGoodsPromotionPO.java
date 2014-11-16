package Team_wolf_server.server.po;

import java.util.ArrayList;

import Team_wolf_server.server.vo.SpecialGoodsPromotionVO;

/**
 * 
 * @author WHJ
 *
 */
public class SpecialGoodsPromotionPO extends PromotionPO{
	public ArrayList<GiftForPromotionPO> list;
	public double totalPrice;
	
	public SpecialGoodsPromotionPO(SpecialGoodsPromotionVO vo){
		super(PromotionTypePO.specialGoods, vo);
		totalPrice = vo.totalPrice;
		list = setGiftList(vo.list);
	}
}
