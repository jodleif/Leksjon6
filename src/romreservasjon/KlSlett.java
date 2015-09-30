package romreservasjon;

/**
 * Klasse for å representere klokkeslett.
 *
 * Objekter kan lages på to måter:
 *
 * KlSlett k1 = new KlSlett(12, 30); KlSlett k2 = new KlSlett("12:30");
 *
 * Klassen inneholder metoder for å sammenligne klokkeslett og for å konvertere
 * klokkeslett til tekstlig form.
 *
 */
public class KlSlett {

    private int timer;
    private int minutter;

    /*
     * Konstruktør for å lage KlSlett-objekt fra heltall timer og minutter.
     */
    public KlSlett(int timer, int minutter) throws IllegalArgumentException {
        this.timer = timer;
        this.minutter = minutter;
        sjekk();
    }

    /*
     * Konstruktør for å lage KlSlett-objekter fra tekstlig representasjon,
     * på formen "hh:mm"
     */
    public KlSlett(String strKlSlett) throws IllegalArgumentException {
        try {
            String[] tidTab = strKlSlett.split(":");
            timer = Integer.parseInt(tidTab[0]);
            minutter = Integer.parseInt(tidTab[1]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Klokkeslett " + strKlSlett + " er ikke på lovlig form tt:mm.");
        }
        sjekk();
    }

    /*
     * Sjekker om to klokkeslett er like.
     */
    public boolean erLik(KlSlett k) {
        String denneTid = this.toString();
        String annenTid = k.toString();
        return denneTid.equals(annenTid);
    }


    /*
     * Sjekker om et klokkeslett er før et annen.
     */
    public boolean før(KlSlett k) {
        int denneTid = timer * 60 + minutter;
        int annenTid = k.timer * 60 + k.minutter;
        return (denneTid < annenTid);
    }

    /*
     * Returnerer en tekstlig representasjon av klokkeslettet.
     */
    public String toString() {
        String ut = "";
        if (timer < 10) {
            ut += "0";
        }
        ut += timer + ":";
        if (minutter < 10) {
            ut += "0";
        }
        ut += minutter;
        return ut;
    }


    /* ------------ HJELPEMETODER ------------------- */
    /*
     *  Sjekk om dette klokkeslettet (this) er lovlig.
     */
    private void sjekk() throws IllegalArgumentException {
        if (timer < 0 || timer > 23 || minutter < 0 || minutter > 59) {
            throw new IllegalArgumentException(
                    timer + ":" + minutter + " er et ulovlig klokkeslett.");
        }
    }

}
