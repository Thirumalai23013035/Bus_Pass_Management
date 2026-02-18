public class Payment {

    private int PaymentId;
    private int pass_id;
    private double amount;
    private String status;

    Payment(int PaymentId,int pass_id,double amount,String status)
    {
        this.PaymentId=PaymentId;
        this.pass_id= pass_id;
        this.amount= amount;
        this.status= status;
    }

    public int get_PaymentId()
    {
        return PaymentId;
    }

    public int get_passid()
    {
        return pass_id;
    }

    public double get_Amount()
    {
        return amount;
    }

    public String get_ispayed()
    {
        return status;
    }

    void display_payment(String Username)
    {
        System.out.println("PaymentId : "+PaymentId);
        System.out.println("Name      : "+Username);
        System.out.println("pass_id   : " +pass_id);
        System.out.println("Amount    : " +amount);
        System.out.println("ispayed   : " +status);

    }

    
    
}
