package Team_wolf_server.server.po;

import java.io.Serializable;


public class DecreaseToMatchPO extends ApplicationPO implements Serializable{

	 GoodsPO toDecrease;
		
     public DecreaseToMatchPO(GoodsPO toDecrease){
   	  this.toDecrease=toDecrease; 
     }
     
     public String getInfo(){
   	  return toDecrease.getNumber()+" "+toDecrease.getName()+" "+toDecrease.getModel()+" "+toDecrease.getAmount();
     }
     
     public String getNumber(){
   	  return toDecrease.getNumber();
     }
     
     public String getName(){
   	  return toDecrease.getName();
     }
     
     public String getModel(){
   	  return toDecrease.getModel();
     }
     
     public String getAmount(){
   	  return ""+toDecrease.getAmount();
     }
}
