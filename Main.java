
class Administration
{
  private String userid;
  private String password;
                               /* if admin forgot password then using getters and setters*/
  public String getUserid()
  {
    return userid;
  }
  public String getpassword()
  {
    return password;
  }
  public void Setpassword(String password)
  {
    this.password=password;
    
  }

  public Administration(String userid,String password)
  {
    this.userid=userid;
    this.password=password;
  }
   public void login()
   {
    if(userid=="admin"&& password=="secret")
    {
      System.out.println("admin login");
    }
    else
    {
      System.out.println("Invalid userid or password");
    }
  }
  public void logout()
  {
    System.out.println("logout");
  }
}
class Bankaccount
{
	String AccountHolder;
	long Accountnumber;
	String Type;
	String Bankcode;
	String Branch;
	static String Bankname="xyz";
    double Balance=900;

    public Bankaccount(String AccountHolder,long Accountnumber,String Type,String Bankcode,String Branch)
    {
    	this.AccountHolder=AccountHolder;
    	this.Accountnumber=Accountnumber;
    	this.Type=Type;
    	this.Bankcode=Bankcode;
    	this.Branch=Branch;
    }

   public void AccountDetails()
   {
   	System.out.println("AccountHolder "+AccountHolder);
   	System.out.println("Accountnumber "+Accountnumber);
   	System.out.println("Account Type "+Type);
   	System.out.println("Branch "+Branch);
   }
   public void ShowBankName()
   {
   	System.out.println("BankName "+Bankname);
   }
   public void depositTransaction(double Amount)
   {
   	  Balance=Balance+Amount;
   	  System.out.println("Amount Deposited "+Amount);
   	  System.out.println("Available Balance"+Balance);
   }
   public void withdrawTransaction(double Amount)
   {
   	if(Amount <= Balance)
   	{
   		Balance=Balance-Amount;
   		System.out.println("Amount withdrawen"+Amount);
   		System.out.println("Available Balance"+Balance);
   	}
   	else
   	{
   		System.out.println("you cannot withdraw more then your balance");
   	}
   }
}
class Main
{
	public static void main(String[] args)
	 { 
     Administration a1=new Administration("admin","secret");
    a1.login();
    a1.logout();
	 	Bankaccount Ref = new Bankaccount("Bob",81234234212l,"Savings","xyz001","Jakkur");
    Ref.AccountDetails();
	 	Ref.ShowBankName();
	 	Ref.depositTransaction(100);
	 	Ref.withdrawTransaction(100);

    Bankaccount Ref1 = new Bankaccount("Alice",81234234213l,"Savings","xyz001","Electronic city");
    Ref1.AccountDetails();
    Ref1.ShowBankName();
    Ref1.depositTransaction(600);
    Ref1.withdrawTransaction(500);

    Bankaccount Ref2 = new Bankaccount("Joe",81234234214l,"Savings","xyz001","Anekal");
    Ref2.AccountDetails();
    Ref2.ShowBankName();
    Ref2.depositTransaction(200);
    Ref2.withdrawTransaction(300);
		
	}
}



