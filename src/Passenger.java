/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmet Oğuzhan Günöz
 */
public abstract class Passenger implements Chargeable
{
    private final String name;
    private final double Weight;
    private Luggage luggage;
    
    public Passenger(String Name, double weight, Luggage luggage)
    {
        if(Name.length() < 0)
        {
            throw new IllegalArgumentException("Name must be exist");
        }
        else if (Name.matches("[0-9]+"))
        {
            throw new IllegalArgumentException("Name must be characters");
        }
        
        if(weight <= 0)
        {
            throw new IllegalArgumentException("Weight must be > 0");
        }
        
        this.name = Name;
        this.Weight = weight;
        this.luggage = luggage;
    }
    
    public String getName()
    {
        return name;
    }
    
    @Override
    public double getWeight()
    {
        return Weight;
    }
    
    public Luggage getLuggage()
    {
        return luggage;
    }
       
    public abstract double CostOfPassenger();
    
}
