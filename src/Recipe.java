class Recipe {
    private String typ;
    private String titel;
    private String zutaten;
    private String beschreibung;
    private String dauer;
    private String portionen;
    private String herkunftsland;
    public Recipe(String Typ, String Titel, String Zutaten, String Beschreibung, String Dauer, String Portionen, String Herkunftsland) {
        this.typ = Typ;
        this.titel = Titel;
        this.zutaten = Zutaten;
        this.beschreibung = Beschreibung;
        this.dauer = Dauer;
        this.portionen = Portionen;
        this.herkunftsland = Herkunftsland;
    }
    public String getType() {
        return typ;
    }
    public String getTitel() {
        return titel;
    }
    public String getZutaten() {
        return zutaten;
    }
    public String getBeschreibung() {
        return beschreibung;
    }
    public String getDauer() {
        return dauer;
    }
    public String getPortionen() {
        return portionen;
    }
    public String getHerkunftsland() {
        return herkunftsland;
    }
    @Override
    public String toString() {
        return "Titel: " + titel + "\n" +
        "Typ: " + typ + "\n" +
        "Zutaten: " + zutaten + "\n" +
        "Beschreibung: " + beschreibung + "\n" +
        "Dauer: " + dauer + "\n" +
        "Portionen: " + portionen + "\n" +
        "Herkunft: " + herkunftsland + "\n";
    }
}



