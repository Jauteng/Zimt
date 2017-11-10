package oszimt;

import java.util.ArrayList;
import java.util.Date;

class Haus {

    private ArrayList<Wohnung> wohnungen;
    private Date reinigungsDatum;
    private double kellerFlaeche;
    private Addresse addresse;

    public Haus(ArrayList<Wohnung> wohnungen, Date reinigungsDatum, double kellerFlaeche, Addresse addresse) {
        this.wohnungen = wohnungen;
        this.reinigungsDatum = reinigungsDatum;
        this.kellerFlaeche = kellerFlaeche;
        this.addresse = addresse;
    }

    public Addresse getAddresse() {
        return addresse;
    }

    public void setAddresse(Addresse addresse) {
        this.addresse = addresse;
    }

    public double getKellerFlaeche() {

        return kellerFlaeche;
    }

    public void setKellerFlaeche(double kellerFlaeche) {
        this.kellerFlaeche = kellerFlaeche;
    }

    public Date getReinigungsDatum() {

        return reinigungsDatum;
    }

    public void setReinigungsDatum(Date reinigungsDatum) {
        this.reinigungsDatum = reinigungsDatum;
    }

    public ArrayList<Wohnung> getWohnungen() {

        return wohnungen;
    }

    public void setWohnungen(ArrayList<Wohnung> wohnungen) {
        this.wohnungen = wohnungen;
    }

    @Override
    public String toString() {
        return "Haus{" +
                "wohnungen=" + wohnungen +
                ", reinigungsDatum=" + reinigungsDatum +
                ", kellerFlaeche=" + kellerFlaeche +
                ", addresse=" + addresse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Haus)) return false;

        Haus haus = (Haus) o;

        if (Double.compare(haus.getKellerFlaeche(), getKellerFlaeche()) != 0) return false;
        if (!getWohnungen().equals(haus.getWohnungen())) return false;
        return (getReinigungsDatum() != null ? getReinigungsDatum().equals(haus.getReinigungsDatum()) : haus.getReinigungsDatum() == null) && getAddresse().equals(haus.getAddresse());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getWohnungen().hashCode();
        result = 31 * result + (getReinigungsDatum() != null ? getReinigungsDatum().hashCode() : 0);
        temp = Double.doubleToLongBits(getKellerFlaeche());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getAddresse().hashCode();
        return result;
    }
}
