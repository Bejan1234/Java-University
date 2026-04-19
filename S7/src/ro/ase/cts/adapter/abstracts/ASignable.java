package ro.ase.cts.adapter.abstracts;

public abstract class ASignable {
    protected String username;
    protected String password;

    public boolean signUp(String username, String pass) {
        return (this.username.equals(username) && this.password.equals(pass));
    }
}
