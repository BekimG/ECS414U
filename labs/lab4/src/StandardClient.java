public class StandardClient extends Client implements Resettable{

    public StandardClient(String name){
        super(name);
    }
    public void deposit(int amount){
        this.getAccount().deposit(amount);
    }
    public void reset(){
        this.setAccount(new Account());
    }


}
