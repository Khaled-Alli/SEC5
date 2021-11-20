package Staff_Member;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your Department");
        String dep = input.nextLine();
        
       Abstract_Factory mem = Member_Factory.getDepartment_Factory(dep);
       
       Staff s1= mem.getMember();
       s1.print();
      
    }
    
}
