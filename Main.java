// BANKING APPLICATION 
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

  public Administration(String userid,String password)        /* constructor of Administrartion */
  {
    this.userid=userid;
    this.password=password;
  }
     // LOGIN METHOD OF ADMIN
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
  // LOGOUT METHOD OF ADMIN
  public void logout()
  {
    System.out.println("logout");
  }
} 
// BANKACCOUNT CLASS 
class Bankaccount
{
	String AccountHolder;
	long Accountnumber;
	String Type;
	String Bankcode;
	String Branch;
	static String Bankname="xyz";
    double Balance=900;    

    // BANKACCOUNT CONSTRUCTOR

    public Bankaccount(String AccountHolder,long Accountnumber,String Type,String Bankcode,String Branch)
    {
    	this.AccountHolder=AccountHolder;
    	this.Accountnumber=Accountnumber;
    	this.Type=Type;
    	this.Bankcode=Bankcode;
    	this.Branch=Branch;
    }
    // ACCOUNT DETAILS  OF CUSTOMER
   public void AccountDetails()
   {
   	System.out.println("AccountHolder = "+AccountHolder);
   	System.out.println("Accountnumber = "+Accountnumber);
   	System.out.println("Account Type  = "+Type);
   	System.out.println("Branch = "+Branch);
   }

    // BANK NAME IS CONSTANT FOR ALL THE CUSTOMERS SO STATIC AND DIRECTLY USING IT IN MAIN METHOD
   public static void ShowBankName()
   {
   	System.out.println("BankName "+Bankname);
   }

   public void ShowBalance()
   {
      System.out.println("Available Balance = "+Balance);
   }

   // METHOD FOR DEPOSIT TRANSACTION 
   public void depositTransaction(double Amount)
   {
   	  Balance=Balance+Amount;
   	  System.out.println("Amount Deposited = "+Amount);
   	
   }
   // METHOD FOR WITHDRAW TRANSACTION
   public void withdrawTransaction(double Amount)
   {
   	if(Amount<Balance)
   	{
   		Balance=Balance-Amount;
   		System.out.println("Amount withdrawen = "+Amount);
   	}
   	else
   	{
   		System.out.println("you cannot withdraw more then your balance");

   	}
   }
} 

// MAIN CLASS 
class BankApp
{
	public static void main(String[] args)
	 { 
     Administration a1=new Administration("admin","secret"); 
    a1.login();     
    a1.logout(); 

    System.out.println(" ");   //  JUST  USED TO SEE PROGRAM CLEARLY 

	 	Bankaccount Ref = new Bankaccount("Bob",81234234212l,"Savings","xyz001","Jakkur");
    Ref.AccountDetails();
	 	Ref.ShowBankName();
	 	Ref.depositTransaction(100);
    Ref.ShowBalance();
	 	Ref.withdrawTransaction(1500);
    Ref.ShowBalance();

    System.out.println(" ");   // JUST USED  TO SEE PROGRM CLEARLY 

    Bankaccount Ref1 = new Bankaccount("Alice",81234234213l,"Savings","xyz001","Electronic city");
    Ref1.AccountDetails();
    Ref1.ShowBankName();
    Ref1.depositTransaction(200);
    Ref1.ShowBalance();
    Ref1.withdrawTransaction(100);
    Ref1.ShowBalance();
    
    System.out.println(" ");    // JUST USED  TO SEE PROGRM CLEARLY 

    Bankaccount Ref2 = new Bankaccount("Joe",81234234214l,"Savings","xyz001","Anekal");
    Ref2.AccountDetails();
    Ref2.ShowBankName();
    Ref2.depositTransaction(1100);
    Ref2.ShowBalance();
    Ref2.withdrawTransaction(100);
    Ref2.ShowBalance();
		
	}
}



