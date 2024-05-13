public class Classroom
{
    private String teacher;
    private int classSize;
    private int numBoys;
    private int roomNum;

    public Classroom(String tchr, int size, int nBoys, int room)
    {
        teacher = tchr;
        classSize = size;
        numBoys = nBoys;
        roomNum = room;
    }

    public int getNumBoys()
    {
        return numBoys;
    }

    public int getNumGirls()
    {
        return classSize - numBoys;
    }

    public void setRoomNum(int rn)
    {
        roomNum = rn;
    }

    /*
        use toString to help for debugging class objects
    */
    public String toString( )
    {
        String msg = String.format("%s has %d students: \n boys count: %d \n girls count: %d \n room number: %d \n ====================", teacher, classSize, numBoys, getNumGirls(), roomNum);
        return msg;
    }
}