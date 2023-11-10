public class Triangolo implements Forma {

    int base, altezza;

    public double calcoloArea(){

        return (base * altezza)/2;
    }

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

}