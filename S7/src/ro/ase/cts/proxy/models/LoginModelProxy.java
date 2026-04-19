package ro.ase.cts.proxy.models;

import ro.ase.cts.proxy.abstracts.ILoginable;

public class LoginModelProxy implements ILoginable {
    private static final int MAX_ATTEPTS=3;
    private final ILoginable loginModule;
    private static int count;

    public LoginModelProxy(ILoginable loginModule) {
        this.loginModule = loginModule;
    }

    @Override
    public boolean login(String username, String pass){
        if(count<MAX_ATTEPTS){
            if(loginModule.login(username,pass)){
                count=0;
                return true;
            }
            count++;
            return false;
        }
        return false;
    }
}
