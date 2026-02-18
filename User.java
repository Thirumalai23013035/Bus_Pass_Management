public class User {

    private int user_id;
    private String name;
    private int age;
    private String phone;
    private String role;

    User(int user_id,String name, int age,String phone,String role)
    {
        this.user_id = user_id;
        this.name = name;
        this.age= age;
        this.phone = phone;
        this.role = role;
    }


    
    public User() {
        //TODO Auto-generated constructor stub
    }



    void set_id(int user_id)
    {
        this.user_id = user_id;
    }

    int get_id()
    {
        return user_id;
    }

    void set_name(String name)
    {
        this.name = name;
    }

    String get_name()
    {
        return name;
    }

    void set_age(int age)
    {
        this.age = age;
    }

    int get_age()
    {
        return age;
    }

    void set_phone(String phone)
    {
        this.phone = phone;
    }

    String get_phone()
    {
        return phone;
    }

     void set_role(String role)
    {
        this.role = role;
    }

    String get_role()
    {
        return role;
    }

    void display_User()
    {
        System.out.printf("User_id : %d\n",user_id);
        System.out.printf("Name    : %s\n",name);
        System.out.printf("Age     : %d\n",age);
        System.out.printf("Phone   : %s\n",phone);
        System.out.printf("Role    : %s\n",role);
    }
     


    
}
