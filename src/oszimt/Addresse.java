package oszimt;

public class Addresse {

    private String strasse;
    private String hausnr;
    private String plz;
    private String zusatz;

    public Addresse(String strasse, String hausnr, String plz, String zusatz) {
        this.strasse = strasse;
        this.hausnr = hausnr;
        this.plz = plz;
        this.zusatz = zusatz;
    }

    public String getZusatz() {

        return zusatz;
    }

    public void setZusatz(String zusatz) {
        this.zusatz = zusatz;
    }

    public String getPlz() {

        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getHausnr() {

        return hausnr;
    }

    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }

    public String getStrasse() {

        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    @Override
    public String toString() {
        return "Addresse{" +
                "strasse='" + strasse + '\'' +
                ", hausnr='" + hausnr + '\'' +
                ", plz='" + plz + '\'' +
                ", zusatz='" + zusatz + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Addresse)) return false;

        Addresse addresse = (Addresse) o;

        if (getStrasse() != null ? !getStrasse().equals(addresse.getStrasse()) : addresse.getStrasse() != null)
            return false;
        if (getHausnr() != null ? !getHausnr().equals(addresse.getHausnr()) : addresse.getHausnr() != null)
            return false;
        if (getPlz() != null ? !getPlz().equals(addresse.getPlz()) : addresse.getPlz() != null) return false;
        return getZusatz() != null ? getZusatz().equals(addresse.getZusatz()) : addresse.getZusatz() == null;
    }

    @Override
    public int hashCode() {
        int result = getStrasse() != null ? getStrasse().hashCode() : 0;
        result = 31 * result + (getHausnr() != null ? getHausnr().hashCode() : 0);
        result = 31 * result + (getPlz() != null ? getPlz().hashCode() : 0);
        result = 31 * result + (getZusatz() != null ? getZusatz().hashCode() : 0);
        return result;
    }
}
