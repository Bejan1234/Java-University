package ro.ase.cts.proxy.models;
import ro.ase.cts.proxy.abstracts.ILoginable;

public class LoginModel implements ILoginable{
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin5";

    @Override
    public boolean login(String username, String pass){
        return (LoginModel.USERNAME.equals(username)&& LoginModel.PASSWORD.equals(pass));


    }
}
