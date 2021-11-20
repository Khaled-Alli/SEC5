package Staff_Member;
public class CS_TeachingAssistant implements Staff
{

    @Override
    public int getSalary() 
    {
        return 8000;
    }

    @Override
    public int getYearsOfWork()
    {
        return  5;
    }
    public void print() {
        System.out.println("I'm CS Teaching Assistant\nMy Salary is "+getSalary()+"\nMy Years of Work is "+getYearsOfWork()+" Years");
    }
}
