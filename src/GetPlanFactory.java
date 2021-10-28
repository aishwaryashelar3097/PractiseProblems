//Create a GetPlanFactory to generate object of concrete classes based on given information.
public class GetPlanFactory  {
 
	      
		   //use getPlan method to get object of type Plan   
		       public Plan getPlan(String planType){  
		            if(planType == null){  
		             return null;  
		            }  
		          if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
		                 return new DomesticPlan();  
		               }   
		           else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
		                return new CommercialPlan();  
		            }     
		          
		      return null;  
		   }  
		}//end of GetPlanFactory class. 

