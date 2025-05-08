public class Account{

     private double balance;
     

         public Account(double initialBalance ) {

     if ( initialBalance > 0.0 )
         balance = initialBalance;
         }

         public void credit(double amount ) {
     
     balance = balance + amount;
}

          public double getBalance() {
         return balance;
 }
  public void debit(double amount) {
      if (balance < amount) {
          System.out.println("Debit amount exceeded amount balance");
      } else {
          balance = balance - amount;
      }
  }
   public void displayBalance(){
       System.out.println("This is the final Balance : "+balance);
   }
         }
