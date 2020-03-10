import java.util.*;
/**
 * Store details of club memberships.
 * 
 * @author (Vashishth) 
 * @version (27/02/2020)
 */
public class Club
{
    private ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members = new ArrayList<>();
    }

    public void join(Membership member)
    {
        members.add(member);
    }
    
    public int numberOfMembers()
    {
        int count = 0;
        for ( Membership element : members) {count++;}
        return count;
    }
}
