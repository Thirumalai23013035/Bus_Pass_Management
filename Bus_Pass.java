public class Bus_Pass {

    
    private int pass_id;
    private int user_id;
    private String route;
    private String type;
    private int validity;

    Bus_Pass(int pass_id,int user_id,String route, String type,int validity)
    {
        this.pass_id = pass_id;
        this.user_id = user_id;
        this.route = route;
        this.type= type;
        this.validity= validity;
    }

     public Bus_Pass() {
        //TODO Auto-generated constructor stub
    }

     void set_passid(int pass_id)
    {
        this.pass_id = pass_id;
    }

    int get_passid()
    {
        return pass_id;
    }


    
    void set_id(int user_id)
    {
        this.user_id = user_id;
    }

    int get_id()
    {
        return user_id;
    }

    void set_route(String route)
    {
        this.route = route;
    }

    String get_route()
    {
        return route;
    }

    void set_passtype(String type)
    {
        this.type = type;
    }

    String get_passtype()
    {
        return type;
    }

    void set_validity(int validity)
    {
        this.validity = validity;
    }

    int get_validity()
    {
        return validity;
    }

  

    void display_pass()
    {
        System.out.printf("Pass_id   : %d\n",pass_id);
        System.out.printf("User_id   : %d\n",user_id);
        System.out.printf("Route     : %s\n",route);
        System.out.printf("Type      : %s\n",type);
        System.out.printf("Validity  : %d days\n",validity);
    }
     


    
}

    

