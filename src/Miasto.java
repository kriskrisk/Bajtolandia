public class Miasto {
    private String nazwa;
    private int rokZałożenia;
    private int liczbaMieszkańców;
    protected Sąsiad[] sąsiedzi;

    public Miasto(String nazwa, int rokZałożenia, int liczbaMieszkańców, Sąsiad[] sąsiedzi) {
        this.nazwa = nazwa;
        this.rokZałożenia = rokZałożenia;
        this.liczbaMieszkańców = liczbaMieszkańców;
        this.sąsiedzi = sąsiedzi;
    }

    public void zwiedź(Turysta zwiedzający) {};
}
