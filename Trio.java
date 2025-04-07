//Write your answer here

public class Trio implements MenuItem
{
    private Sandwhich sandwhich; 
    private Salad salad; 
    private Drink drink; 

    public Trio(Sandwhich pbj, Salad ceaser, Drink drpepper)
    {
        sandwhich = pbj;
        salad = ceaser; 
        drink = drpepper; 
    }

    public String getName()
    {
        return sandwhich.getName() + "/" + salad.getName() + "/" + drink.getName() + "Trio";

    }

    public double getPrice()
    {
        MenuItem cheapest= sandwhich;

        if(salad.getPrice()<cheapest.getPrice())
        cheapest = salad; 
        if(drink.getPrice()<cheapest.getPrice())
        cheapest = drink; 

        return sandwhich.getPrice()+salad.getPrice()+drink.getPrice()-cheapest.getPrice();
        
    }











}