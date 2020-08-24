import java.util.ArrayList;
import java.util.List;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 20.08.2020
 * @author
 */

public class Bank {
  
  // Anfang Attribute
  private customer customer;

  private String bankName;
  private List<String> customers = new ArrayList<>();
  // Ende Attribute

  public Bank(String bankName){

    this.bankName = bankName;
    customers.add("muster");
  }

  // Anfang Methoden

  public int getCustomers() {
    return customers.size();
  }
  //TODO:
  // add customer to List customers 
  public void setCustomer(){
   
    customers.add(customer.getFirstName() + " " + customer.getLastName());
  }

  public static void main(String[] args) {
    
    Bank bank2 = new Bank("bankName");
    
    bank2.setCustomer();
  }
  // Ende Methoden
} // end of Bank

