public class PhoneTester1
{
  public static void main(String args[])
  {
  Phone1.phoneName = "vivo";
  Phone1.numberNumbers = 10;
  Phone1.funcButton = 12;
  Phone1.workCond = 'W';
  if(Phone1.phoneName=="vivo")
  {
  System.out.println("Phone name is correct:"+Phone1.phoneName);
  }
  else{
	  System.out.println("Phone ame is incorrect:"+Phone1.phoneName);
  }
  if(Phone1.numberNumbers==10)
  {
    System.out.println("Number of numbers is correct:"+Phone1.numberNumbers);
  }
else{
     System.out.println("number of number is incorrect:"+Phone1.numberNumbers);
  }
  if(Phone1.funcButton==12)
  {	  
    System.out.println("function keys is correct:"+Phone1.funcButton);
  }
  else{
     System.out.println("function keys is incorrect:"+Phone1.funcButton);
  }
  if(Phone1.workCond=='W')
  {	  
	System.out.println("Working condition is start:"+Phone1.workCond);
  }
  else{
     System.out.println("working condition not start:"+Phone1.workCond);
  }	 
    System.out.println("Number Of Phones:"+Phone1.numberOfPhones);  
    System.out.println("Login Hours:"+Phone1.loginHours);  
    System.out.println("Owner number:"+Phone1.ownerNum);  
    System.out.println("Cost of laptop:"+Phone1.totalCost);
    System.out.println("Is this machine:"+Phone1.isThisMachine);
    System.out.println("Available for sale:"+Phone1.availableSale);
	}
	
}