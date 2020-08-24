import java.util.Scanner;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 20.08.2020
 * @author 
 */

public class customer {
  
  // Anfang Attribute

  private Bank bank;
  private Account account;

  private String firstName;
  private String lastName;
  private int ssNumber;
  private int checkingORsaving;
  private double deposit;
  private int id;
  // Ende Attribute
  
  // Anfang Konstroktur
  public customer(String firstName, String lastName, int ssNumber, int checkingORsaving, double deposit, int id){

    this.firstName = firstName;
    this.lastName = lastName;
    this.ssNumber = ssNumber;
    this.checkingORsaving = checkingORsaving;
    this.deposit = deposit;
    this.id = id;
  }
  // Ende Konstroktur

  // Anfang Methoden
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstNameNeu) {
    firstName = firstNameNeu;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastNameNeu) {
    lastName = lastNameNeu;
  }

  public int getSsNumber() {
    return ssNumber;
  }

  public void setSsNumber(int ssNumberNeu) {
    ssNumber = ssNumberNeu;
  }

  public int getCheckingORsaving() {
    return checkingORsaving;
  }

  public void setCheckingORsaving(char checkingORsavingNeu) {
    checkingORsaving = checkingORsavingNeu;
  }
  
  public double getDeposit() {
    return deposit;
  }
  public void setDeposit(double deposit) {
    this.deposit = deposit;
  }
  
  public int getId() {
    return id;
  }

  public void setId(int idNeu) {
    id = idNeu;
  }
  
  
  // Ende Methoden
  
  public static void main(String[] args) {
    
    Bank bank = new Bank("SpaKa");

    System.out.println("First name: ");
    Scanner scan0 = new Scanner(System.in);
    String firstName = scan0.nextLine();
    System.out.println("Last name: ");
    Scanner scan1 = new Scanner(System.in);
    String lastName = scan0.nextLine();
    System.out.println("social security number: ");
    Scanner scan2 = new Scanner(System.in);
    int ssNumber = scan2.nextInt();
    System.out.println("for a cheking account 0 for a saving account 1: ");
    Scanner scan3 = new Scanner(System.in);
    int checkingORsaving = scan3.nextInt();
    while (checkingORsaving != 0 && checkingORsaving != 1 ) {
      System.out.println("Please give 0 or 1:");
      checkingORsaving = scan2.nextInt();
    }
    System.out.println("How much deposit: ");
    Scanner scan4 = new Scanner(System.in);
    int deposit = scan4.nextInt();
    while (deposit < 100) {
      System.out.println("please give a sum larger than 100:");
      deposit = scan4.nextInt();
    }
    int id = bank.getCustomers();

    customer cus = new customer(firstName, lastName, ssNumber, checkingORsaving, deposit, id);
    System.out.println("Your ID is:\n" + cus.getId());
  }
} // end of customer

