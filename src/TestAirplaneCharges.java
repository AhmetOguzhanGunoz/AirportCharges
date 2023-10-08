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
       Chargeable [] chargeables = new Chargeable [8];
       
       chargeables[0] = new Child("Ahmet Ali",45.5,new Luggage(100,10.5));
       chargeables[1] = new Adult("Isaac Newton",100,new Luggage(101,35.6));
       chargeables[2] = new Child("Albert Einstein",64,new Luggage(102,25.7));
       chargeables[4] = new Adult("Aziz Sancar", 74.25,new Luggage(103,23.8));
       chargeables[5] = new Adult("Uğur Şahin", 71.11,new Luggage(104,17.9));           
       chargeables[6] = new Adult("Özlem Türeci", 70.12,new Luggage(105,17.9));
       chargeables[7] = new Adult("Ahmet Oğuzhan Günöz", 75.5,null);
       
       int numOfChild = 0,numOfAdult = 0,numOfLuggage = 0;
              
       for(Chargeable currentCharge: chargeables)
       {
           if(currentCharge instanceof Child)
           {
               if(((Child) currentCharge).getLuggage() != null)
               {
                   System.out.printf("Name: %s\n", ((Child) currentCharge).getName());
                   System.out.printf("Weight: %.2f, Luggage Weight: %.2f\n", ((Child) currentCharge).getWeight(),((Child) currentCharge).getLuggage().getWeight());
                   System.out.printf("Total Charge: %.2f₺ + %.2f₺ = %.2f₺\n", ((Child) currentCharge).CostOfPassenger(),((Child) currentCharge).getLuggage().CostOfLuggage(),((Child) currentCharge).CostOfPassenger() + ((Child) currentCharge).getLuggage().CostOfLuggage());
                   numOfChild++;
                   numOfLuggage++;
               }
               else
               {
                   System.out.printf("Name: %s\n", ((Child) currentCharge).getName());
                   System.out.printf("Weight: %.2f\n", ((Child) currentCharge).getWeight());
                   System.out.printf("Total Charge: %.2f₺ + %s₺ = %.2f₺\n", ((Child) currentCharge).CostOfPassenger(), "0",((Child) currentCharge).CostOfPassenger() + ((Child) currentCharge).CostOfPassenger());
                   numOfChild++;               
               }
           }
           else if(currentCharge instanceof Adult)
           {
               if(((Adult) currentCharge).getLuggage() != null)
               {
                   System.out.printf("Name: %s\n", ((Adult) currentCharge).getName());
                   System.out.printf("Weight: %.2f, Luggage Weight: %.2f\n", ((Adult) currentCharge).getWeight(),((Adult) currentCharge).getLuggage().getWeight());
                   System.out.printf("Total Charge: %.2f₺ + %.2f₺ = %.2f₺\n", ((Adult) currentCharge).CostOfPassenger(),((Adult) currentCharge).getLuggage().CostOfLuggage(),((Adult) currentCharge).CostOfPassenger() + ((Adult) currentCharge).getLuggage().CostOfLuggage());
                   numOfAdult++;
                   numOfLuggage++;
               }
               else
               {
                   System.out.printf("Name: %s\n", ((Adult) currentCharge).getName());
                   System.out.printf("Weight: %.2f\n", ((Adult) currentCharge).getWeight());
                   System.out.printf("Total Charge: %.2f₺ + %s₺ = %.2f₺\n", ((Adult) currentCharge).CostOfPassenger(),"0",((Adult) currentCharge).CostOfPassenger());
                   numOfAdult++;                 
               }
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
