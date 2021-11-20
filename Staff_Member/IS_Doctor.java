package Staff_Member;
import java.util.*;
public class IS_Doctor implements Staff
{
    
    @Override
    public int getSalary() {
      return 12000;
    }

    @Override
    public int getYearsOfWork()
    {
       return 10;
    }

    @Override
    public void print() {
        System.out.println("I'm IS Doctor\nMy Salary is "+getSalary()+"\nMy Years of Work is "+getYearsOfWork()+" Years");
    }

  
}
