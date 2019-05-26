package kamzs.ambro;

public class Test
{
    public Provider provider;

    public static void main(String[] args) {

        Test test = new Test();
        Ploter ploter = new Ploter();
        test.setProvider(ploter);
        test.save();
        test.setProvider(new Printer());
        test.save();


    }

    private void save() {
        provider.save();
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
