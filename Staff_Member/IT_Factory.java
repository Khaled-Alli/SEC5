package Staff_Member;
public class IT_Factory extends Abstract_Factory
{
  public Staff getMember()
    {
        return new IT_Doctor();
    }

    
}
