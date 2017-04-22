import java.util.Random;

public abstract class Turysta {
    protected String imię;
    protected Miasto obecnieZajmowaneMiasto;
    protected Miasto miastoZamieszkania;

    public Turysta(String imię, Miasto miastoZamieszkania) {
        this.imię = imię;
        this.obecnieZajmowaneMiasto = miastoZamieszkania;
        this.miastoZamieszkania = miastoZamieszkania;
    }

    abstract Sąsiad wybierzMiasto();

    public Sąsiad losujMiasto(Sąsiad[] listaMożliwychWyborów) {
        Random r = new Random();
        int x = r.nextInt(listaMożliwychWyborów.length);

        return listaMożliwychWyborów[x];
    }

    public void zmieńMiasto(Miasto noweMiasto) {
        this.obecnieZajmowaneMiasto = noweMiasto;
    }
}
