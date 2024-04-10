import java.util.Scanner;   // Needed for Scanner class

/**
This program shows an array being processed with loops.
 */

public class ArrayDemo3   
{
    public static void main(String[] args) {
        // Declare, create, initialize arrays
        int[] room = { 101, 106, 209, 203, 213 };
        int[] classSize = { 5, 32, 15, 8, 14 };
        int[] boys = { 2, 9, 6, 4, 3 };
        String[] names = { "J.Ali", "K.Johnson", "K.Tran", "C.Gonzalez", "S.Anderson" };

        // Title
        System.out.println("Alton Elementary ======");
        // Q1 - Print the teachers and room numbers
        // System.out.print("Teacher\tRoom\tClass Size\tBoys\tGirls\tRatio\t");
        printArray(names);
        printArray(room);

        // Q2 - How many rooms are upstairs?
        int upstairs = 0;
        int i = 0;
        while (i < room.length) 
        {
            if (room[i] >= 200) {
                upstairs += 1;
            }
            i++;
        }
        System.out.println("There are " + upstairs + " rooms upstairs");

        // Q3 - Which teacher has the most students?
        int max = 0;
        int teacherIndex = 0;
        for (int k = 0; k < classSize.length; k++) 
        {
            int size = classSize[k];
            if (size > max)
            {
                max = size;
                teacherIndex = k;
            }
        }
        System.out.println(names[teacherIndex] + " has the most students");

        // Q4 - Which teacher has the most boys?
        teacherMostBoys(names, boys);

        // Q5 - Which teacher has the most girls?
        teacherMostGirls(names, classSize, boys);

        int myVariable = 500;
        addTwoNumbers(101, myVariable);
    }

     public static int addTwoNumbers(int num1, int num2)
    {
        return num1 + num2;
    }

    // overloaded methods
    public static void printArray(double[] ary) 
    {
        for (int i = 0; i < ary.length; i++)
        {   
            System.out.println(ary[i] + " ");
        }
    }

    public static void printArray(int[] ary) 
    {
        for (int i = 0; i < ary.length; i++)
        {   
            System.out.println(ary[i] + " ");
        }
    }

    public static void printArray(String[] ary) 
    {
        for (int i = 0; i < ary.length; i++)
        {   
            System.out.println(ary[i] + " ");
        }
    }
    // overloaded methods end
    
    public static void teacherMostGirls(String[] names, int[] classSize, int[] boys) {
        int maxGirls = 0;
        int teacherWithMostGirls = 0;
        for (int k = 0; k < boys.length; k++) 
        {
            int boysInClass = boys[k];
            int girlsInClass = classSize[k] - boysInClass;
            if (girlsInClass > maxGirls)
            {
                maxGirls = girlsInClass;
                teacherWithMostGirls = k;
            }
        }

        System.out.println(names[teacherWithMostGirls] + " has most girls");
    }

    public static void teacherMostBoys(String[] names, int[] boys) {
        int maxBoys = 0;
        int teacherWithMostBoys = 0;
        for (int k = 0; k < boys.length; k++) 
        {
            int boysInClass = boys[k];
            if (boysInClass > maxBoys)
            {
                maxBoys = boysInClass;
                teacherWithMostBoys = k;
            }
        }
        System.out.println(names[teacherWithMostBoys] + " has most boys");
    } 




}     
