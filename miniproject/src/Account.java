public class Account{
    private double balance;
    private double cash;
    private int numberOfGoogleStock;
    private int numberOfAppleStock;
    private int numberOfEthTokens;
    private int numberOfBitcoinTokens;


    public Account(double balance, double cash, int numberOfGoogleStock, int numberOfAppleStock, int numberOfEthTokens, int numberOfBitcoinTokens){
        this.balance = balance;
        this.cash = cash;
        this.numberOfAppleStock = numberOfAppleStock;
        this.numberOfGoogleStock = numberOfGoogleStock;
        this.numberOfEthTokens = numberOfEthTokens;
        this.numberOfBitcoinTokens = numberOfBitcoinTokens;
    }
    //Method to add funds
    public void addFunds(double balance, double cash){
        this.balance += cash;
    }
    //Method to remove funds
    public void removeFunds(double balance, double cash){
        this.balance -= cash;
    }
    //Method to return the user's balance
    public double getBalance(){
        return this.balance;
    }
    //Methods to return number of certain assets
    public int getNumberOfGoogleStock(){
        return this.numberOfGoogleStock;
    }
    public int getNumberOfAppleStock(){
        return this.numberOfAppleStock;
    }
    public int getNumberOfEthTokens(){
        return this.numberOfEthTokens;
    }
    public int getNumberOfBitcoinTokens(){
        return this.numberOfBitcoinTokens;
    }
    ///////////////////////////////////////////////////
    //Methods to add assets to the user's account and remove funds based on the cost of the asset
    public void addGoogleStock(double balance, double cash){
        this.numberOfGoogleStock += 1;
        removeFunds(balance, cash);
    }
    public void addAppleStock(double balance, double cash){
        this.numberOfAppleStock += 1;
        removeFunds(balance, cash);
    }
    public void addEthToken(double balance, double cash){
        this.numberOfEthTokens += 1;
        removeFunds(balance, cash);
    }
    public void addBitcoinToken(double balance, double cash){
        this.numberOfBitcoinTokens += 1;
        removeFunds(balance, cash);
    }
    ////////////////////////////////////////////////////
    //Methods to remove assets from a user's account and add funds based on the price of the assets
    public void sellGoogleStock(double balance, double cash){
        this.numberOfGoogleStock -= 1;
        addFunds(balance,cash);
    }
    public void sellAppleStock(double balance, double cash){
        this.numberOfAppleStock -= 1;
        addFunds(balance,cash);
    }
    public void sellEthToken(double balance, double cash){
        this.numberOfEthTokens -= 1;
        addFunds(balance,cash);
    }
    public void sellBitcoinToken(double balance, double cash){
        this.numberOfBitcoinTokens -= 1;
        addFunds(balance,cash);
    }
}
