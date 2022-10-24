//Class used to display menu aspects
public class Menu{
    //Method to display the main menu of the program
    public void menu()
    {
        System.out.println("Enter 1: To Deposit Money");
        System.out.println("Enter 2: To Withdraw Money");
        System.out.println("Enter 3: To Buy An Asset");
        System.out.println("Enter 4: To Sell An Asset");
        System.out.println("Enter 5: To View Your Portfolio");
        System.out.println("Enter 6: To Exit The App");

    }
    //Method to display an error message to the user
    public void errorMessage(){
        System.out.println("Transaction Unsuccessful");
    }
    //Method to display an exit message and close the program
    public void exitMessage(){
        System.out.println("Closing App");
        System.exit(0);
    }
}
