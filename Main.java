import java.util.*;

public class Main {
    public static void main(String[] args) {

        // User obj = new User(1,"Thirumalai",18,"7339413624","Student");
        // Bus_Pass obj2 = new Bus_Pass(1,1,"Krishnagiri", "Student", 30);

        // obj.display_User();
        // obj2.display_pass();

        Scanner sc = new Scanner(System.in);

        BusService bus = new BusService();

        int choice;
        do{
             System.out.println("----------------------------");
            System.out.println("1 : Create_user");
            System.out.println("2 : Create_pass");
            System.out.println("3 : View_users");
            System.out.println("4 : View_passes");
            System.out.println("5 : Search_passes");
            System.out.println("6 : Renewal_passes");
            System.out.println("7 : View_payments");
            System.out.println("8 : Exit");
            System.out.println("Enter a choice");
            
            
            choice = sc.nextInt();
            switch(choice){
                case 1:
                bus.Create_user();
                break;
                case 2:
                    bus.Create_pass();
                    break;
                case 3:
                    bus.View_users();
                    break;
                case 4:
                    bus.View_passes();
                    break;
                 case 5:
                    bus.search_pass();
                    break;
                case 6:
                    bus.renew_pass();
                    break;
                case 7:
                    bus.view_payments();
                    break;

            }
        }while(choice!=8);


        
        
    }
}
