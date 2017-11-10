package oszimt;

import java.util.Date;

class Mieter {
    private String vorname;
    private String nachname;
    private Date mietdauer;
    private Boolean verzug;

    public Mieter(String vorname, String nachname, Date mietdauer, Boolean verzug) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.mietdauer = mietdauer;
        this.verzug = verzug;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Date getMietdauer() {
        return mietdauer;
    }

    public void setMietdauer(Date mietdauer) {
        this.mietdauer = mietdauer;
    }

    public Boolean getVerzug() {
        return verzug;
    }

    public void setVerzug(Boolean verzug) {
        this.verzug = verzug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mieter)) return false;

        Mieter mieter = (Mieter) o;

        if (getVorname() != null ? !getVorname().equals(mieter.getVorname()) : mieter.getVorname() != null)
            return false;
        if (getNachname() != null ? !getNachname().equals(mieter.getNachname()) : mieter.getNachname() != null)
            return false;
        if (getMietdauer() != null ? !getMietdauer().equals(mieter.getMietdauer()) : mieter.getMietdauer() != null)
            return false;
        return getVerzug() != null ? getVerzug().equals(mieter.getVerzug()) : mieter.getVerzug() == null;
    }

    @Override
    public int hashCode() {
        int result = getVorname() != null ? getVorname().hashCode() : 0;
        result = 31 * result + (getNachname() != null ? getNachname().hashCode() : 0);
        result = 31 * result + (getMietdauer() != null ? getMietdauer().hashCode() : 0);
        result = 31 * result + (getVerzug() != null ? getVerzug().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Mieter{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", mietdauer=" + mietdauer +
                ", verzug=" + verzug +
                '}';
    }
}
