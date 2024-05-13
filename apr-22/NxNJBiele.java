
/**
 * 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;

public class NxNJBiele
{
    // instance variables
    private int[] ary;                //last name A-F
    //private int[][] ary;            //last name G-R
    //private ArrayList<Integer> ary; //last name S-Z
    private int n;

    public NxNJBiele(int n)
    {
        // constructor
        this.n = n;
        ary = new int[n*n];
        for (int i=0; i<ary.length; i++)
        {
            ary[i] = i+1;
        }
    }

    public String toString()
    {
        // use toString method to neatly print the aryray
        String msg = "QQQ";
        for (int i=0; i<ary.length; i++)
        {
        }
        return msg;
    }

    public void printMe()
    {
        System.out.println(toString());
    }

    public int addRow(int rr)
    {
        // add the values in each of the rows
        int sum = 123;
        for (int i=0; i<123; i++)
        {
            
        }
        return sum;
    }

    public void shake()
    {
        // pick two random elements in the array
        // and exchange them
        Random rnd = new Random();

    }

    public int addCol(int cc)
    {
        // add the values in each of the columns
        int sum = 123;
        for (int i=0; i<123; i++)
        {
            
        }
        return sum;
    }

    public int addDiag1()
    {
        // add the value in the top left to lower right diagonal
        int sum = 0;
        for (int i=0; i<123; i++)
        {
            
        }
        return sum;
    }

    public int addDiag2()
    {
        // add the value in the rop right to lower left diagonal
        int sum = 0;
        for (int i=0; i<123; i++)
        {
           
        }
        return sum;
    }
}
