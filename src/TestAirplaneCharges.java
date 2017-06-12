/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmet Oğuzhan Günöz
 */
public class TestAirplaneCharges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Chargeable [] chargeables = new Chargeable [5];
       
       chargeables[0] = new Child("Ahmet Ali",45.5);
       chargeables[1] = new Adult("John Newton",86.4);
       chargeables[2] = new Child("Nora Johnson",62);
       chargeables[3] = new Luggage(324,35.5);
       chargeables[4] = new Adult("Sue Brown", 94.25);
       
       int numOfChild = 0,numOfAdult = 0,numOfLuggage = 0;
              
       for(Chargeable currentCharge: chargeables)
       {
           if(currentCharge instanceof Luggage)
           {
               System.out.printf("ID: %.0f\n", ((Luggage) currentCharge).getID());
               System.out.printf("Weight: %.2f\n", ((Luggage) currentCharge).getWeight());
               System.out.printf("Charge: %.2f$\n", ((Luggage) currentCharge).CostOfLuggage());
               numOfLuggage++;
           }
           else if(currentCharge instanceof Child)
           {
               System.out.printf("Name: %s\n", ((Child) currentCharge).getName());
               System.out.printf("Weight: %.2f\n", ((Child) currentCharge).getWeight());
               System.out.printf("Charge: %.2f$\n", ((Child) currentCharge).CostOfPassenger());
               numOfChild++;
           }
           else if(currentCharge instanceof Adult)
           {
               System.out.printf("Name: %s\n", ((Adult) currentCharge).getName());
               System.out.printf("Weight: %.2f\n", ((Adult) currentCharge).getWeight());
               System.out.printf("Charge: %.2f$\n", ((Adult) currentCharge).CostOfPassenger());
               numOfAdult++;
           }
           else
           {
               System.out.println("This is not chargeable");
           }
           
           System.out.println("--------------");
        }
       
       System.out.println("Number of adults: " + numOfAdult);
       System.out.println("Number of children: " + numOfChild);
       System.out.println("Number of pieces of luggage: " + numOfLuggage);
    }
}
