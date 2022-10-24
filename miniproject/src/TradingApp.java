//Main class of the program. Used to initialize all objects and perform all if branches, based on user input.
import java.util.*;
public class TradingApp{
    public static void main(String[] args){
        //Initializing all objects
        Stock google = new Stock("Google", 150.0);
        Stock apple = new Stock("Apple", 200.0);
        Crypto eth = new Crypto("Ethereum",435.12);
        Crypto bitcoin = new Crypto("Bitcoin",648.94);
        Account user = new Account(0.0,0.0,0,0,0,0);
        Menu mainMenu = new Menu();
        public void displayMenu1(){
            System.out.println("Your current balance is: £" + user.getBalance());
            System.out.println("How much would you like to deposit?");
            Scanner depositKeyboard = new Scanner(System.in);
            double depositInput = depositKeyboard.nextDouble();
            user.addFunds(user.getBalance(), depositInput);
            System.out.println("Your total balance is now: £" + user.getBalance());
        }
        public void displayMenu2(){
            System.out.println("Your current balance is: £" + user.getBalance());
            System.out.println("How much would you like to withdraw?");
            Scanner withdrawKeyboard = new Scanner(System.in);
            double withdrawInput = withdrawKeyboard.nextDouble();
            if(user.getBalance() >= withdrawInput){
                user.removeFunds(user.getBalance(), withdrawInput);
                System.out.println("Your total balance is now: £" + user.getBalance());
            }
            else{
                mainMenu.errorMessage();
            }
        }
        public void displayMenu3(){
            System.out.println("Would you like to purchase a stock or crypto?");
            System.out.println("Enter 1 to sell a stock from Google. You currently own: " + user.getNumberOfGoogleStock());
            System.out.println("Enter 2 to sell a stock from Apple. You currently own: " + user.getNumberOfAppleStock());
            System.out.println("Enter 3 to sell an Ethereum token. You currently own: " + user.getNumberOfEthTokens());
            System.out.println("Enter 4 to sell a Bitcoin token. You currently own:" + user.getNumberOfBitcoinTokens());
            Scanner sellKeyboard = new Scanner(System.in);
            int sellInput = sellKeyboard.nextInt();
            //If statement for when the user is asked what asset they would like to sell
            if(sellInput == 1){
                if(user.getNumberOfGoogleStock() > 0){
                    user.sellGoogleStock(user.getBalance(), google.getValue());
                    System.out.println("Your total balance is now £" + user.getBalance());
                }
                else{
                    mainMenu.errorMessage();
                }
            }
            else if(sellInput == 2){
                if(user.getNumberOfAppleStock() > 0){
                    user.sellAppleStock(user.getBalance(), apple.getValue());
                    System.out.println("Your total balance is now £" + user.getBalance());
                }
                else{
                    mainMenu.errorMessage();
                }
            }
            else if(sellInput == 3){
                if(user.getNumberOfEthTokens() > 0){
                    user.sellEthToken(user.getBalance(), eth.getValue());
                    System.out.println("Your total balance is now £" + user.getBalance());
                }
                else{
                    mainMenu.errorMessage();
                }
            }
            else if(sellInput == 4){
                if(user.getNumberOfBitcoinTokens() > 0){
                    user.sellBitcoinToken(user.getBalance(), bitcoin.getValue());
                    System.out.println("Your total balance is now £" + user.getBalance());
                }
                else{
                    mainMenu.errorMessage();
                }
            }
            else{
                mainMenu.errorMessage();
            }
        }

        public void displayMenu4() {
            System.out.println("What asset would you like to sell?");
            System.out.println("Enter 1 to sell a stock from Google. You currently own: " + user.getNumberOfGoogleStock());
            System.out.println("Enter 2 to sell a stock from Apple. You currently own: " + user.getNumberOfAppleStock());
            System.out.println("Enter 3 to sell an Ethereum token. You currently own: " + user.getNumberOfEthTokens());
            System.out.println("Enter 4 to sell a Bitcoin token. You currently own:" + user.getNumberOfBitcoinTokens());
            Scanner sellKeyboard = new Scanner(System.in);
            int sellInput = sellKeyboard.nextInt();
            //If statement for when the user is asked what asset they would like to sell
            if (sellInput == 1) {
                if (user.getNumberOfGoogleStock() > 0) {
                    user.sellGoogleStock(user.getBalance(), google.getValue());
                    System.out.println("Your total balance is now £" + user.getBalance());
                } else {
                    mainMenu.errorMessage();
                }
            } else if (sellInput == 2) {
                if (user.getNumberOfAppleStock() > 0) {
                    user.sellAppleStock(user.getBalance(), apple.getValue());
                    System.out.println("Your total balance is now £" + user.getBalance());
                } else {
                    mainMenu.errorMessage();
                }
            } else if (sellInput == 3) {
                if (user.getNumberOfEthTokens() > 0) {
                    user.sellEthToken(user.getBalance(), eth.getValue());
                    System.out.println("Your total balance is now £" + user.getBalance());
                } else {
                    mainMenu.errorMessage();
                }
            } else if (sellInput == 4) {
                if (user.getNumberOfBitcoinTokens() > 0) {
                    user.sellBitcoinToken(user.getBalance(), bitcoin.getValue());
                    System.out.println("Your total balance is now £" + user.getBalance());
                } else {
                    mainMenu.errorMessage();
                }
            } else {
                mainMenu.errorMessage();
            }
        }

        //A for loop used to display the menu and perform all if statements and returning the user to the menu when needed
        for(int i = 0; i < 99; i++){
            mainMenu.menu();
            Scanner keyboard = new Scanner(System.in);
            int menuInput = keyboard.nextInt();
            //If statement for when the user inputs 1 in the menu
            if(menuInput == 1){
                displayMenu1();
            }
            //Else if statement for when the user inputs 2 in the menu
            else if(menuInput == 2){
                displayMenu2();
            }
            //Else if statement for when the user inputs 3 in the menu
            else if(menuInput == 3){
                displayMenu3();
            }
            //Else if statement for when the user inputs 4 in the menu
            else if(menuInput == 4){
                displayMenu4();
            }
            //Else if statement for when the user inputs 5 in the menu
            else if(menuInput == 5){
                System.out.println("YOUR PORTFOLIO");
                System.out.println("YOUR BALANCE: " + user.getBalance());
                System.out.println("NUMBER OF GOOGLE STOCK OWNED: " + user.getNumberOfGoogleStock());
                System.out.println("NUMBER OF APPLE STOCK OWNED:" + user.getNumberOfAppleStock());
                System.out.println("NUMBER OF ETHEREUM TOKENS OWNED: " + user.getNumberOfEthTokens());
                System.out.println("NUMBER OF BITCOIN TOKENS OWNED: " + user.getNumberOfBitcoinTokens());
            }
            //Else if statement for when the user inputs 6 in the menu
            else if(menuInput == 6){
                mainMenu.exitMessage();
            }
            else{
                System.out.println("Invalid input.");
            }
        }
    }

}
}