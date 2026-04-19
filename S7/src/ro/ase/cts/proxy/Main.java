package ro.ase.cts.proxy;

import ro.ase.cts.proxy.abstracts.ILoginable;
import ro.ase.cts.proxy.models.LoginModel;
import ro.ase.cts.proxy.models.LoginModelProxy;

public class Main {
    public static void main(String[]args){
        LoginModel lm1=new LoginModel();
        boolean isLogged=lm1.login("admin","admin");
        System.out.println(isLogged);

        for(int i=0;i<10;i++){
            isLogged=lm1.login("admin","admin"+i);
            if(isLogged){
                System.out.println("Webrute forced the password on"+i+"attempts");
            }
        }
        ILoginable log1=new LoginModelProxy(lm1);
        for(int i=0;i<10;i++) {
            isLogged = log1.login("admin", "admin" + i);
            if (isLogged) {
                System.out.println("Webrute forced the password on" + i + "attempts");
            }
            System.out.println("attepmts" + i);
        }
    }
}
