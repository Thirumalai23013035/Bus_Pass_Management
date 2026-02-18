import java.util.ArrayList;
import java.util.Scanner;

public class BusService {

    Scanner sc = new Scanner(System.in);

    ArrayList<User>users = new ArrayList<>();

    ArrayList<Bus_Pass>passes = new ArrayList<>();

    ArrayList<Payment>payments = new ArrayList<>();

   public  void Create_user()
    {
        User obj = new User();
        System.out.println("Enter a id :");
        obj.set_id(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter a Name :");
        obj.set_name(sc.nextLine());
        System.out.println("Enter a age :");
        obj.set_age(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter a Phone :");
        obj.set_phone(sc.nextLine());
        System.out.println("Enter a Role :");
        obj.set_role(sc.nextLine());
       
        users.add(obj);


    }

    public  void View_users()
    {
        for(User userit : users)
        {
            userit.display_User();
        }
    }

    public void Create_pass()
    {
        Bus_Pass pass = new Bus_Pass();
        System.out.println("Enter a pass_id :");
        int pass_id = sc.nextInt();
        pass.set_passid(pass_id);
        System.out.println("Enter a user_id :");
        pass.set_id(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter a route :");
        pass.set_route(sc.nextLine());
        System.out.println("Enter a passtype(student/senior_citizen/general) :");
        String type = sc.nextLine(); 
        pass.set_passtype(type);
        System.out.println("Enter a  Validity:");
        pass.set_validity(sc.nextInt());

        double amount =0;
        if(type.equalsIgnoreCase("student"))
        {
            amount =500;
        }
        else if(type.equalsIgnoreCase("senior_citizen")){
            amount = 350;
        }
        else if(type.equalsIgnoreCase("general")){
            amount = 650;
        }

        if(MakePayment(pass.get_passid(),amount))
        {
            passes.add(pass);
            System.out.println("pass succesfully created");
        }
        else{
            System.out.println("pass creation failure due to payment");
        }

    }

   

    public void View_passes()
    {
        for(Bus_Pass passit: passes)
        {
            passit.display_pass();
        }
    }

    public void search_pass()
    {
        System.out.println("Enter pass_id to search:");
        int id = sc.nextInt();
        

        for(Bus_Pass p : passes)
        {
            if(p.get_passid()==id)
            {
                System.out.println("Enter pass_id found");
                p.display_pass();
                return;
            }
        }
        System.out.println("user not found");
    }

    public void renew_pass()
    {
       
        System.out.println("Enter pass_id for Renewal:");
        int id = sc.nextInt();

        
        for(Bus_Pass p : passes)
            {
                if(p.get_passid()==id)
                    {
                        System.out.println("Enter days for renewal:");
                        int extra_days = sc.nextInt();
                        String type = p.get_passtype();
                        int rate =0;

                        if(type.equalsIgnoreCase("Student"))
                        {
                            rate = 30;
                        }
                        else if(type.equalsIgnoreCase("senior_citizen"))
                        {
                            rate = 10;
                        }
                        else{
                            rate = 45;
                        }

                        double amount = rate * extra_days;

                        if(MakePayment(p.get_passid(), amount))
                        {

                            int previous_days = p.get_validity();
                            p.set_validity(previous_days+extra_days);
                            System.out.println("pass renewed success");
                            break;
                        }

                
            }
            System.out.println("pass not found");

        }
    }

    public boolean MakePayment(int pass_id,double amount)
    {
        System.out.println("are you paying this amount: "+amount);

        System.out.println("Are you confiem this payment(Yes/No)");
        sc.nextLine();

        String confirm = sc.nextLine();

        if(confirm.equalsIgnoreCase("yes"))
        {
            int Payment_id = payments.size()+1;
            Payment pay = new Payment(Payment_id,pass_id,amount,"success");
            payments.add(pay);
            return true;
        }
        else{
            System.out.println("Payment failure");
            return false;

        }
    }


    public String get_name_from_userId(int id)
    {
        for(User u : users)
        {
            if(u.get_id()==id)
            {
                return u.get_name();
            }
        }
        return "unknown";
    }

    public int get_userId_from_passid(int passId)
    {
        for(Bus_Pass bus : passes)
        {
            if(bus.get_passid()==passId)
            {
                return bus.get_id();
            }
        }
        return -1;
    }



    public void view_payments()
    {
        for(Payment p : payments)
        {
            int pass_id = p.get_passid();
            int userId = get_userId_from_passid(pass_id);
            String name = get_name_from_userId(userId);
            System.out.println("this is the paymentt list");
            System.out.println("----------------------------");
            p.display_payment(name);
        }
       
    }


   
    
}
