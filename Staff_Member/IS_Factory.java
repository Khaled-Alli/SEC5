package Staff_Member;
public class IS_Factory extends Abstract_Factory
{
    Staff getMember()
    {
        return new IS_Doctor();
    }
}
