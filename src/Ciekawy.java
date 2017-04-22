public class Ciekawy extends Turysta {
    private Miasto[] odwiedzoneMiasta;

    public Ciekawy(String imię, Miasto miastoZamieszkania) {
        super(imię, miastoZamieszkania);
        this.odwiedzoneMiasta = null;
    }

    public Sąsiad wybierzMiasto() {
        int i = 0;
        boolean czyOdwiedzone;

        while(i < obecnieZajmowaneMiasto.sąsiedzi.length) {
            czyOdwiedzone = false;

            for(int j = 0; j < odwiedzoneMiasta.length; j++) {
                if (obecnieZajmowaneMiasto.sąsiedzi[i].getMiasto() == odwiedzoneMiasta[j]) {
                    czyOdwiedzone = true;
                }
            }

            if (!czyOdwiedzone) {
                return obecnieZajmowaneMiasto.sąsiedzi[i];
            }
        }

        return super.losujMiasto(obecnieZajmowaneMiasto.sąsiedzi);
    }
}
