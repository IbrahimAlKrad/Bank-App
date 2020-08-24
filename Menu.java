import java.util.Scanner;

public class Menu {
    
    //Attribute
    customer cus;

    //Methoden
    //TODO:
    //Login Methode
    public void show(){
        System.out.println("+-----------------------------------+");
        System.out.println("|                                   |");
        System.out.println("|             welcome To            |");
        System.out.println("|             ~M.A. Bank~           |");
        System.out.println("|                                   |");
        System.out.println("|                                   |");
        System.out.println("+-----------------------------------+");
        System.out.println("Please select an option below:");
        System.out.println("1) Creat a new Account");
        System.out.println("2) Make a deposit");
        System.out.println("3) Make a withdrawal");
        System.out.println("4) List account details");
        System.out.println("5) Exit");
    }
    public int scanInput(){

        Scanner scan0 = new Scanner(System.in);
        int input = scan0.nextInt();
        return input;
    }
    //FIXME:
    public void choise(int input){
        switch (input) {
            case 1:
                
                break;
            case 5:
                System.out.println("Okay, see U son:)!");
                break;
            default:
                System.out.println("Please choose a number between 1 & 5");
                choise(scanInput());
        }
    }
    public static void main(String[] args) {
        
        Menu menu = new Menu();
        
        menu.show();
        menu.choise(menu.scanInput());
    }
}