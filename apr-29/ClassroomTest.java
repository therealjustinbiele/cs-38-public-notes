
/**
 * The test class ClassroomTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClassroomTest
{
    /**
     * Default constructor for test class ClassroomTest
     */
    public static void main(String[] args)
    {
        Classroom classroom1 = new Classroom("Mister Professor Professorson", 5, 3, 101);
        Classroom classroom2 = new Classroom("Severus Snape", 29, 19, 102);
        Classroom classroom3 = new Classroom("Albus Dumbledore", 143, 68, 110);
        Classroom classroom4 = new Classroom("Gandalf", 54, 22, 103);
        Classroom classroom5 = new Classroom("Hagrid", 22, 11, 501);

        Classroom[] school = new Classroom[5];
        school[0] = classroom1;
        school[1] = classroom2;
        school[2] = classroom3;
        school[3] = classroom4;
        school[4] = classroom5;

        Classroom[] school2 = { classroom1, classroom2, classroom3, classroom4, classroom5 };

        for (int i = 0; i < school.length; i++)
        {
            System.out.println(school[i]);
        }
    }

}
