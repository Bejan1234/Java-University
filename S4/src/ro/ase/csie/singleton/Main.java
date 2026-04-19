import ro.ase.csie.singleton.models.DbConection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    DbConection dbConection=DbConection.getInstance("Gigel");
    DbConection dbConection2 = DbConection.getInstance("Marcel");


}
