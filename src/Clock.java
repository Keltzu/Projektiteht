public class Clock {
    // Singleton-olio
    private static Clock instance;
    private long time; // Kellon aika

    // Yksityinen konstruktori estää olion luomisen ulkopuolelta
    private Clock() {
        this.time = 0; // Asetetaan aluksi aika nollaksi
    }

    // Singleton-olio palautetaan
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // Aseta kellon aika
    public void setTime(long time) {
        this.time = time;
    }

    // Hae kellon aika
    public long getTime() {
        return time;
    }

    // Testiohjelma kellon toiminnan tarkistamiseksi
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();

        // Asetetaan kellon aika
        clock.setTime(5000);
        System.out.println("Aika asetettu: " + clock.getTime());

        // Vaihdetaan kellon aikaa
        clock.setTime(10000);
        System.out.println("Aika vaihdettu: " + clock.getTime());

        // Kokeillaan, että Singleton toimii
        Clock clock2 = Clock.getInstance();
        System.out.println("Toinen viite kelloon: " + clock2.getTime());

        // Varmistetaan, että clock ja clock2 viittaavat samaan instanssiin
        System.out.println("Sama instanssi? " + (clock == clock2));
    }
}
