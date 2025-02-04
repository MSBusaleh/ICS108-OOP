package exception;

public class InvalidTime extends Exception{

    public InvalidTime(){
        super("Invalid Time");
    }

    public  InvalidTime(String s){
        super(s);
    }
}
