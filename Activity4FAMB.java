import java.util.Scanner;

public class OOP {
	 static Scanner in = new Scanner(System.in);	  
         public String name, name2, message;
	 public static float amount,amount1, balance=30;
         public float number;
         public int Phonenum;
       
         public void Menu() {
    	 System.out.println("\nWelcome to AT&T");
		   System.out.println("Press   [1] - Create Account");
		   System.out.println("		   [8] - Add New Account");
		   System.out.println("        [2] - Display Account");
		   System.out.println("        [3] - Send");
		   System.out.println("        [4] - Call");
		   System.out.println("        [5] - Load");
		   System.out.println("        [6] - Inquire balance");
		   System.out.println("        [7] - Exit");
		   System.out.println("        Choice: ");
		   
		   
           }
	   public void Create(String name, int Phonenum) {
			  OOP b = new OOP();
			   System.out.print("Enter Name:");
			   b.name = in.next();
			   System.out.print("Enter Account#:");
			   b.Phonenum = in.nextInt();	
		                    
                     
                   	  
           }
	   public void Inquire() {
	   System.out.println("\nYour current balance: P" + balance);
	   }
	   public void Call() {
	   OOP b = new OOP();
           System.out.print("Enter a number:");
	      b.number = in.nextFloat();
           System.out.print("Calling number.\n\n");
           balance = balance-7.5f;
	   }	   
	   public boolean Create(){
			  Scanner in = new Scanner(System.in);
			   System.out.print("Enter Name:");
			   name = in.next();
			   System.out.print("Enter Account#:");
			   Phonenum = in.nextInt();
			   if(Phonenum>100) {
				   name="";
				   Phonenum=0;
				   return false;
			   }
			   else return true;
		  }
	   public void Display() {		   
		   System.out.println("Hello "+name+", Account#: "+Phonenum);
	   }
	   public void Send() {
           OOP A = new OOP();
           System.out.print("Enter a number:");
	   A.number = in.nextFloat();
	   System.out.print("Enter message:");
	   A.message = in.next();
	   System.out.print("Message sent\n\n");
	   balance=balance-1f;
	   }
	   public void Load(float amount) {
		   balance= amount+ balance;
		   System.out.println("Amount"+amount+", is successfully loaded. New wallet balace is "+balance);   
	    }
	   
 		public static void main(String args[]) {		  
			  int f;
			  OOP A= new OOP();
			  boolean a=true;
			  
			  Scanner in = new Scanner(System.in);
			  OOP obj[] = new OOP[10];
			  for(int i=0;i<3;i++) {
				  obj[i] = new OOP(); 		
			  do {				 
				 A.Menu();
				 f = in.nextInt();			   
               switch (f) {
               case 1:
            	   A.Create();
            	   break;
               case 2:
            	   A.Display();
            	   break;
               case 3:
            	   A.Send();
            	   break; 
               case 4:
            	  A.Call();
            	  break;
               case 5:           	   
            	   OOP d = new OOP();
        		   System.out.println("Enter amount to load to your wallet: ");
        		   d.amount1= in.nextFloat();
        		   A.Load(amount1);
            	   break;
               case 6:
                     A.Inquire();
                     break;
               case 7:
     
            	   System.out.println("Thank you. See you soon");                 
                     break;
                } 
	        } while (f!=7);
		}}
		}
		


               
		   
		   



			   		  
			   
			   
		   
			   



