package ro.ase.cts.adapter.models;

import ro.ase.cts.adapter.abstracts.ILoginable;
import ro.ase.cts.adapter.abstracts.ASignable;

public class SignupToLoginAdapterObject implements ILoginable {
    private ASignable signable;

    public SignupToLoginAdapterObject(ASignable signable) {
        this.signable = signable;
    }

    @Override
    public boolean login(String username, String pass) {
        return signable.signUp(username, pass);
    }
}
