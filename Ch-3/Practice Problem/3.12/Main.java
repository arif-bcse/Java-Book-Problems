
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

  Account a = new Account(50);
  a.credit(100);
  a.getBalance();
  a.displayBalance();
  a.debit(50);
  a.displayBalance();
    }
}
