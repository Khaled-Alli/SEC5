package Staff_Member;
public class Member_Factory 
{
   public static Abstract_Factory getDepartment_Factory(String depart)
    {
        if(depart.equalsIgnoreCase("IS"))
            return new IS_Factory();
        else if(depart.equalsIgnoreCase("CS"))
            return new CS_Factory();
         else if(depart.equalsIgnoreCase("IT"))
            return new IT_Factory();
        return null;
    }
}
