public class Losowy extends Turysta {
    public Losowy(String imię, Miasto miastoZamieszkania) {
        super(imię, miastoZamieszkania);
    }

    public Sąsiad wybierzMiasto() {
        return super.losujMiasto(obecnieZajmowaneMiasto.sąsiedzi);
    }
}
