public class Majówka {
    private int dzień;
    private Turysta[] tablicaTurystów;
    private Miasto[] tablicaMiast;

    public Majówka(Turysta[] tablicaTurystów, Miasto[] tablicaMiast) {
        this.dzień = 0;
        this.tablicaMiast = tablicaMiast;
        this.tablicaTurystów = tablicaTurystów;
    }

    public void przeprowadźMajówkę() {
        while (this.dzień <= 7) {
            for (int i = 0; i < tablicaTurystów.length; i++) {
                Miasto noweMiasto = tablicaTurystów[i].wybierzMiasto();
                tablicaTurystów[i].zmieńMiasto(noweMiasto);
                noweMiasto.zwiedź(tablicaTurystów[i]);
            }

            this.dzień++;
        }
    }
}
