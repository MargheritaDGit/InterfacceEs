public class Rettangolo implements Forma{
    private int base, altezza;

    public Rettangolo(){}

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

    public double calcoloArea(){

        return base * altezza;
    }

}

