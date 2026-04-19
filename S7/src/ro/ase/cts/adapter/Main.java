package ro.ase.cts.adapter;

import ro.ase.cts.adapter.abstracts.ASignable;
import ro.ase.cts.adapter.models.LoginModule;
import ro.ase.cts.adapter.models.SignupModule;
import ro.ase.cts.adapter.models.SignupToLoginAdapterObject;
import ro.ase.cts.adapter.abstracts.ILoginable;


public class Main {
    public static void main(String[] args) {
        ILoginable login=new LoginModule();
        System.out.println(login.login("admin", "admin5") ? "Succesful login!" : "Unsuccesful login!");

        ASignable sign=new SignupModule("pass","pass");
        System.out.println(sign.signUp("root","root") ? "Succesful login!" : "Unsuccesful login!");

        login=new SignupToLoginAdapterObject(sign);
        System.out.println(login.login("pass","pass") ? "Succesful login!" : "Unsuccesful login!");
    }

}
