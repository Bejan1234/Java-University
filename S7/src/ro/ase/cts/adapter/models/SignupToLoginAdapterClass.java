package ro.ase.cts.adapter.models;

import ro.ase.cts.adapter.abstracts.ASignable;
import ro.ase.cts.adapter.abstracts.ILoginable;

public class SignupToLoginAdapterClass extends ASignable implements ILoginable {

    @Override
    public boolean login(String username, String pass) {
        return this.signUp(username, pass);
    }

}
