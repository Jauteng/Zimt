package oszimt;


public class Wohnung {
    private double miete;
    private String mieter;
    private double raeume;
    private double groesse;
    private boolean balkon;

    public Wohnung () {
    }

    public Wohnung(double miete, String mieter, double raeume, double groesse, boolean balkon) {
        this.miete = miete;
        this.mieter = mieter;
        this.raeume = raeume;
        this.groesse = groesse;
        this.balkon = balkon;
    }

    @Override
    public String toString() {
        return "Wohnung{" +
                "miete=" + miete +
                ", mieter='" + mieter + '\'' +
                ", raeume=" + raeume +
                ", groesse=" + groesse +
                ", balkon=" + balkon +
                '}';
    }

    public boolean isBalkon() {
        return balkon;
    }

    public void setBalkon(boolean balkon) {
        this.balkon = balkon;
    }

    public double getGroesse() {

        return groesse;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public double getRaeume() {

        return raeume;
    }

    public void setRaeume(double raeume) {
        this.raeume = raeume;
    }

    public String getMieter() {

        return mieter;
    }

    public void setMieter(String mieter) {
        this.mieter = mieter;
    }

    public double getMiete() {

        return miete;
    }

    public void setMiete(double miete) {
        this.miete = miete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wohnung)) return false;

        Wohnung wohnung = (Wohnung) o;

        if (Double.compare(wohnung.getMiete(), getMiete()) != 0) return false;
        if (Double.compare(wohnung.getRaeume(), getRaeume()) != 0) return false;
        if (Double.compare(wohnung.getGroesse(), getGroesse()) != 0) return false;
        if (isBalkon() != wohnung.isBalkon()) return false;
        return getMieter() != null ? getMieter().equals(wohnung.getMieter()) : wohnung.getMieter() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getMiete());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getMieter() != null ? getMieter().hashCode() : 0);
        temp = Double.doubleToLongBits(getRaeume());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getGroesse());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isBalkon() ? 1 : 0);
        return result;
    }
}
