package Staff_Member;
public class IT_Doctor implements Staff
{

    @Override
    public int getSalary()
    {
       return 15000;
    }

    @Override
    public int getYearsOfWork() 
    {
       return 10;
    }
    public void print() {
        System.out.println("I'm IT Doctor\nMy Salary is "+getSalary()+"\nMy Years of Work is "+getYearsOfWork()+" Years");
    }
}
