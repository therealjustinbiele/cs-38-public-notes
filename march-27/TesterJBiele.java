
public class TesterJBiele
{
    public static void main(String[] args)
    {
        HourlyWorker w1 = new HourlyWorker("Todd", 20.00);
        HourlyWorker w2 = new HourlyWorker("Mary", 25.00);

        String name = w1.getName();
        int oneWeek = 1;
        int threeWeeks = 3;

        int fourtyHours = 40;
        int thirtyHours = 30

        double w1Paycheck = w1.getPaycheck(oneWeek, fourtyHours);
        double w2Paycheck = w2.getPaycheck(threeWeeks, thirtyHours);
        System.out.print(w1.getName() + "'s paycheck is: " + w1Paycheck);
        System.out.print(w2.getName() + "'s paycheck is: " + w2Paycheck);
    }
}
