package AppException;

public class NegativeWithdrawalException extends Exception{
    public NegativeWithdrawalException(String msg){
        super(msg);
    }
}
