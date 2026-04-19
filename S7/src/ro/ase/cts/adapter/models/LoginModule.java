package ro.ase.cts.adapter.models;

import ro.ase.cts.adapter.abstracts.ILoginable;

public class LoginModule implements ILoginable {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin5";

    @Override
    public boolean login(String username, String pass) {
        return (LoginModule.USERNAME.equals(username) && LoginModule.PASSWORD.equals(pass));
    }
}