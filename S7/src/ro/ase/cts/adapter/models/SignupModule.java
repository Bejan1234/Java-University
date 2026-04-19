package ro.ase.cts.adapter.models;

import ro.ase.cts.adapter.abstracts.ASignable;

public class SignupModule extends ASignable {

    public SignupModule(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
