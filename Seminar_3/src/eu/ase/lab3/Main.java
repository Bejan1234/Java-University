package eu.ase.lab3;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        Aircraft ac1 = new Aircraft( 5);

        Helicopter h1 = new Helicopter(6,6);
        h1.printAircraft();

        Aircraft ac2 = new Helicopter(12,8);
        ac2.printAircraft();

        h1.takeOff();
        h1.land();

        ac2 = ac1.clone();
        ac1.printAircraft();

        Helicopter h2 = (Helicopter) h1.clone();
        h2.printAircraft();

        Airplane.setAirplanesNo(0);

        Airplane ap1 = new Airplane(200, 4);
        System.out.println(Airplane.getAirplanesNo());

        Aircraft ac4 =  new Airplane(100, 6);
        System.out.println(Airplane.getAirplanesNo());

        try(Airplane ap2 = new Airplane(250, 8)){
            ap2.printAircraft();
            System.out.println(Airplane.getAirplanesNo());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}