package Team_wolf_server.server.po;

import java.io.Serializable;


public class IncreaseToMatchPO extends ApplicationPO implements Serializable {

	 GoodsPO toIncrease;
		
     public IncreaseToMatchPO(GoodsPO toIncrease){
   	  this.toIncrease=toIncrease; 
     }
     
     public String getInfo(){
   	  return toIncrease.getNumber()+" "+toIncrease.getName()+" "+toIncrease.getModel()+" "+toIncrease.getAmount();
     }
     
     public String getNumber(){
   	  return toIncrease.getNumber();
     }
     
     public String getName(){
   	  return toIncrease.getName();
     }
     
     public String getModel(){
   	  return toIncrease.getModel();
     }
     
     public String getAmount(){
   	  return ""+toIncrease.getAmount();
     }
}
