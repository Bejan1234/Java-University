import ro.ase.csie.abstracts.ASmartPhone;
import ro.ase.csie.factory.models.ExtraSmartPhone;
import ro.ase.csie.factory.models.MiniSmartPhone;
import ro.ase.csie.factory.models.SmartPhoneFactory;

void main(){
//    SmartPhone smartPhone=new SmartPhone("pro max","apple",300);
    ASmartPhone extraSmartPhone= SmartPhoneFactory.getSmartPhone("extra","galaxy 30","samsung",1000);

}