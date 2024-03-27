public class HourlyWorker
{
    private String name; 
    private double rate;

    public HourlyWorker(String n, double r)
    {
        name = n;
        rate = r;
    }

    public String getName()
    {
        return name;
    }

    public double getPaycheck(int weeks, int hoursPerWeek)
    {
        return rate * (weeks * hoursPerWeek);
    }
}
