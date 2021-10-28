//Generate Bill by using GetPlanFactory to get object of concrete classes by passing type of plan DOMESTICPLAN COMMERCIALPLAN 

public class GenerateBill {
	
	    public static void main(String args[]) {  
	      GetPlanFactory planFactory = new GetPlanFactory();  
	      Plan plan = planFactory.getPlan("DOMESTICPLAN");
	      plan.getRate();
	      plan.calculateBill(5);
	      
	    
	    }
}
//end of GenerateBill class.  

