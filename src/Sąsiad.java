public class Sąsiad {
    private Miasto miasto;
    private int odległość;

    public Sąsiad(Miasto miasto, int odległość) {
        this.miasto = miasto;
        this.odległość = odległość;
    }

    public Miasto getMiasto() {
        return miasto;
    }
}
