package Staff_Member;
public class CS_Factory extends Abstract_Factory
{
    Staff getMember()
    {
        return new CS_TeachingAssistant();
    }

}
