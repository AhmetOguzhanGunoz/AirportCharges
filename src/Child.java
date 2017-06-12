/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmet Oğuzhan Günöz
 */
public class Child extends Passenger
{   
    public double ChargePerKG = 0.5;
    
    public Child(String Name, double weight)
    {
        super(Name,weight);
    }
    
    public String getName()
    {
        return super.getName();
    }
    
    public double getWeight()
    {
        return super.getWeight();
    }
    
    public double CostOfPassenger()
    {
        return super.getWeight() * ChargePerKG;
    }
}
