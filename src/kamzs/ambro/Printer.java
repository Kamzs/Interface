package kamzs.ambro;

public class Printer implements Provider
{
    @Override
    public void save() {
        System.out.println("Drukowanie - drukarka");
    }
}
