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
      
     if(userid.equals("admin")&& password.equals("secret"))
        {
           System.out.println("Admin login");
        }
     else if(userid.equals("admin")&& password.equals(password))          // Generating new password if admin has forgotten
       {
          System.out.println("new password updating ");
       }
     
     else 
       {
          System.out.println("Invalid userid and password");
       }
   } 
  public void logout()                   // LOGOUT METHOD OF ADMIN
    {
      System.out.println("Admin logout");
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
class Bankapp
   {
	    public static void main(String[] args)
	     { 
          Administration a1=new Administration("admin","secret"); 
      a1.login();                          // CALLING LOGIN METHOD 
      a1.Setpassword(" ");                 // GENERATING NEW PASSWORD 
          Bankaccount Ref = new Bankaccount("Bob",81234234212l,"Savings","xyz001","Jakkur");  
          Ref.AccountDetails();
          Ref.ShowBankName();

          System.out.println(" ");       //  JUST  USED TO SEE PROGRAM OUTPUT CLEARLY

          Bankaccount Ref1 = new Bankaccount("Alice",81234234213l,"Savings","xyz001","Electronic city");
          Ref1.AccountDetails();
          Ref1.ShowBankName();
       
          System.out.println(" ");      //  JUST  USED TO SEE PROGRAM OUTPUT CLEARLY

          Bankaccount Ref2 = new Bankaccount("Joe",81234234214l,"Savings","xyz001","Anekal");
          Ref2.AccountDetails();
          Ref2.ShowBankName();
    a1.logout();                        // CALLING LOGOUT METHOD

           System.out.println(" ");     //  JUST  USED TO SEE PROGRAM OUTPUT CLEARLY 
           Ref.AccountDetails();
	         Ref.depositTransaction(100);
           Ref.ShowBalance();

           System.out.println(" ");

   	       Ref.withdrawTransaction(100);
           Ref.ShowBalance();

           System.out.println(" ");   // JUST USED  TO SEE PROGRM CLEARLY 
           Ref2.AccountDetails();
           Ref2.depositTransaction(100);
           Ref2.ShowBalance();

           System.out.println(" ");

           Ref2.withdrawTransaction(1100);
           Ref2.ShowBalance();
		 
	    }
  }



