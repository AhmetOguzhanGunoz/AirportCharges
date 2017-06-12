/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmet Oğuzhan Günöz
 */
public class Luggage implements Chargeable
{
    private final double Weight, ID, ChargePerKG = 1.5;
    
    public Luggage(double Id, double weight)
    {
        if(weight <= 0)
        {
            throw new IllegalArgumentException("Weight must be > 0");
        }
        if(Id < 0)
        {
            throw new IllegalArgumentException("ID must be > 0");
        }
        
        this.ID = Id;
        this.Weight = weight;
    }
    
    public double getID()
    {
        return ID;
    }
    
    public double CostOfLuggage()
    {
        return Weight * ChargePerKG;
    }
    
    @Override
    public double getWeight()
    {
        return Weight;
    }
}
